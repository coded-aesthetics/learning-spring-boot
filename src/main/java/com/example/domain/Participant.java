package com.example.domain;

import javax.persistence.*;
/**
 * Created by coded-aesthetics on 10.03.17.
 */
@Entity
@Table(name = "participant")
public class Participant {
    @Id
    @GeneratedValue()
    private Long Id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "demo_id")
    private Demo demo;

    @OneToOne()
    @JoinColumn(name="person_id")
    private Person person;

    protected Participant() {}

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Demo getDemo() {
        return demo;
    }

    public void setDemo(Demo demo) {
        this.demo = demo;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
