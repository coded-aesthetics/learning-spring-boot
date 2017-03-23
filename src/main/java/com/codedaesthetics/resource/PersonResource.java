package com.codedaesthetics.resource;

import com.codedaesthetics.domain.Person;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by coded-aesthetics on 23.03.17.
 */
public class PersonResource extends ResourceSupport {
    public Person person;
}
