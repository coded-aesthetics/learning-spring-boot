package com.codedaesthetics.domain;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inlineData", types = Participant.class)
public interface ParticipantProjection {
    Long getId();
    String getName();
}