package com.example.repository;

import com.example.domain.Demo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by coded-aesthetics on 10.03.17.
 */
public interface DemoRepository extends CrudRepository<Demo, Long> {
    List<Demo> findDemoByName(@Param("name") String name);
}
