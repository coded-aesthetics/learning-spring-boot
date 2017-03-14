package com.example.domain;

import javax.persistence.*;

/**
 * Created by coded-aesthetics on 10.03.17.
 */
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue()
    private Long Id;

    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    private String address;

    protected Person() {}

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
