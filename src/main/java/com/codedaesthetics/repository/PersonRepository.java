package com.codedaesthetics.repository;

import com.codedaesthetics.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by coded-aesthetics on 15.03.17.
 */
@RepositoryRestResource(excerptProjection = Person.class)
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findPersonByFirstName(@Param("firstName") String firstName);
    List<Person> findPersonByLastName(@Param("lastName") String lastName);
    List<Person> findPersonByFirstNameAndLastName(@Param("firstName") String firstName,@Param("lastName") String lastName);
    List<Person> findByFirstNameIn(@Param("firstNames") Collection<String> firstNames);
    List<Person> findByBirthdateBefore(@DateTimeFormat(pattern = "yyyy-MM-dd") @Param("birthdate") Date birthdate);
    List<Person> findByAddressContaining(@Param("address") String address);
    List<Person> findByBirthdateIsNull();
    List<Person> findByFirstNameOrLastNameOrderByBirthdateAsc(@Param("firstName") String firstName,@Param("lastName") String lastName);
}
