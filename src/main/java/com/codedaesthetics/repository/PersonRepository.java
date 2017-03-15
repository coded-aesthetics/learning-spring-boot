package com.codedaesthetics.repository;

import com.codedaesthetics.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by coded-aesthetics on 15.03.17.
 */
@RepositoryRestResource(excerptProjection = Person.class)
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findPersonByFirstNameAndLastName(@Param("firstName") String firstName,@Param("lastName") String lastName);
}
