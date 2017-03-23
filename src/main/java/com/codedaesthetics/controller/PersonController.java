package com.codedaesthetics.controller;

import com.codedaesthetics.domain.Person;
import com.codedaesthetics.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by coded-aesthetics on 23.03.17.
 */
@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(value = "/gobblediget", method = RequestMethod.GET)
    public List<Person> getPersonBy(@Param("firstName") String firstName, @Param("lastName") String lastName) {
        List<Person> first = personRepository.findPersonByFirstName(firstName);
        List<Person> last = personRepository.findPersonByLastName(lastName);
        first.addAll(last);

        return first;
    }
}
