package com.codedaesthetics.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by coded-aesthetics on 10.03.17.
 */
@Entity
@Table(name="demo")
public class Demo {
    @Id
    @GeneratedValue()
    private Long Id;

    private String name;

    @OneToMany(targetEntity = Participant.class, mappedBy = "demo", cascade = CascadeType.ALL)
    private List<Participant> participants;

    protected Demo() {}

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

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }
}
