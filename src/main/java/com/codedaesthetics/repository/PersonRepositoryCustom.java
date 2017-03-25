package com.codedaesthetics.repository;

import com.codedaesthetics.domain.Person;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by coded-aesthetics on 24.03.17.
 */
public interface PersonRepositoryCustom {
    List<Person> findSomeCustomMethod(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName);
}
