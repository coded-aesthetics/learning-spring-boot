package com.codedaesthetics.repository;

import com.codedaesthetics.domain.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = Participant.class)
public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}
