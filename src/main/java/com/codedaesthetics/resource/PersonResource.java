package com.codedaesthetics.resource;

import com.codedaesthetics.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.support.RepositoryEntityLinks;
import org.springframework.hateoas.ResourceSupport;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.Date;

/**
 * Created by coded-aesthetics on 23.03.17.
 */
@XmlRootElement(name="person")
@XmlSeeAlso({Person.class})
public class PersonResource extends ResourceSupport {

    public Long id;
    public String firstName;
    public String lastName;
    public String address;
    public Date birthdate;

}
