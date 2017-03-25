package com.codedaesthetics.repository;

import com.codedaesthetics.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by coded-aesthetics on 24.03.17.
 */
public class PersonRepositoryImpl implements PersonRepositoryCustom {
    @Override
    public List<Person> someCustomMethod(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        return null;
    }
}
