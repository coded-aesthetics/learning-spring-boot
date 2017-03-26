package com.codedaesthetics.repository;

import com.codedaesthetics.domain.ParticipantCount;

import java.util.List;

/**
 * Created by coded-aesthetics on 26.03.17.
 */
public interface ParticipantCountRepository {
    List<ParticipantCount> getParticipantCounts();
}
