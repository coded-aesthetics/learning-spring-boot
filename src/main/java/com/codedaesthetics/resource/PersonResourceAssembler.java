package com.codedaesthetics.resource;

import com.codedaesthetics.controller.PersonController;
import com.codedaesthetics.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.support.RepositoryEntityLinks;
import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resources;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonResourceAssembler extends ResourceAssemblerSupport<Person, PersonResource> {

    public PersonResourceAssembler() {
        super(PersonController.class, PersonResource.class);
    }

    public PersonResource toResource(Person person) {
        PersonResource personResource = createResourceWithId(person.getId(), person); // adds a "self" link
        personResource.add();
        personResource.id = person.getId();
        personResource.firstName = person.getFirstName();
        personResource.lastName = person.getLastName();
        personResource.address = person.getAddress();
        personResource.birthdate = person.getBirthdate();

        //personResource.add(entityLinks.linkToSingleResource(Person.class, 1));
        return personResource;
    }
}