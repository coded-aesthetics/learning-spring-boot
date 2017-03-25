package com.codedaesthetics.repository;

import com.codedaesthetics.controller.PersonController;
import com.codedaesthetics.domain.Person;
import com.codedaesthetics.resource.PersonResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resources;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by coded-aesthetics on 24.03.17.
 */
public class PersonRepositoryImpl implements PersonRepositoryCustom {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> findSomeCustomMethod(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        List<Person> first = personRepository.findPersonByFirstName(firstName);
        List<Person> last = personRepository.findPersonByLastName(lastName);
        first.addAll(last);

        return first;
    }
}
