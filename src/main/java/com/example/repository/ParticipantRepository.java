package com.example.repository;

import com.example.domain.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}
