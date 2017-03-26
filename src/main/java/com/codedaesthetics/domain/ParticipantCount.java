package com.codedaesthetics.domain;

/**
 * Created by coded-aesthetics on 25.03.17.
 */
public class ParticipantCount {

    private Long id;
    private String name;
    private Long count;

    protected ParticipantCount() {}

    public ParticipantCount(Long id, String name, Long count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getCount() {
        return count;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
