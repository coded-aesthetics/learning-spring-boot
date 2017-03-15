package com.codedaesthetics.repository;

import com.codedaesthetics.domain.Demo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by coded-aesthetics on 10.03.17.
 */
public interface DemoRepository extends CrudRepository<Demo, Long> {
    List<Demo> findDemoByName(@Param("name") String name);
    @Query("SELECT d FROM Demo d INNER JOIN d.participants ps INNER JOIN ps.person p WHERE p.lastName = :lastName")
    List<Demo> findByPersonLastName(@Param("lastName") String lastName);
}
