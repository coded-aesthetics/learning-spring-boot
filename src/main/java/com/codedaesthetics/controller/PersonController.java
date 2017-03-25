package com.codedaesthetics.controller;

import com.codedaesthetics.domain.Person;
import com.codedaesthetics.repository.PersonRepository;
import com.codedaesthetics.resource.PersonResource;
import com.codedaesthetics.resource.PersonResourceAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.data.rest.webmvc.RepositoryLinksResource;
import org.springframework.data.rest.webmvc.RepositorySearchesResource;
import org.springframework.data.rest.webmvc.support.RepositoryEntityLinks;
import org.springframework.hateoas.*;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by coded-aesthetics on 23.03.17.
 */
@BasePathAwareController
@ExposesResourceFor(Person.class)
@RequestMapping(value = "api/persons/search", produces = {MediaType.APPLICATION_JSON_VALUE, "application/hal+json"})
public class PersonController implements ResourceProcessor<RepositorySearchesResource>{
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    PersonResourceAssembler personResourceAssembler;

    @RequestMapping(value = "/gobblediget", method = RequestMethod.GET)
    public ResponseEntity<Resources<PersonResource>> getPersonBy(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        List<Person> first = personRepository.findPersonByFirstName(firstName);
        List<Person> last = personRepository.findPersonByLastName(lastName);
        first.addAll(last);

        //Link link =  ControllerLinkBuilder.linkTo(PersonController.class).slash("/thatiswrong").withSelfRel();
        Link link = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(PersonController.class).getPersonBy(firstName, lastName)).withSelfRel();

        Resources<PersonResource> resources = new Resources<>(personResourceAssembler.toResources(first), link);
        //Link booksLink = linkTo(BookInventoryController).slash('/books').withSelfRel();
        return new ResponseEntity<>(resources, HttpStatus.OK);
    }

    @Override
    public RepositorySearchesResource process(RepositorySearchesResource repositorySearchesResource) {
        if (!Person.class.equals(repositorySearchesResource.getDomainType())) {
            return repositorySearchesResource;
        }
        Link link = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(PersonController.class).getPersonBy(null, null)).withRel("goobbble");
        repositorySearchesResource.add(link);

        return repositorySearchesResource;
    }
}