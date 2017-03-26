package com.codedaesthetics.repository;

import com.codedaesthetics.domain.ParticipantCount;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by coded-aesthetics on 26.03.17.
 */
@Repository
public class ParticipantCountRepositoryImpl implements ParticipantCountRepository {
    @PersistenceContext
    private EntityManager em;


    @Transactional(readOnly = true)
    @Override
    public List<ParticipantCount> getParticipantCounts() {
        String s = "select new com.codedaesthetics.domain.ParticipantCount(d.id, d.name, count(d.id)) from Demo d left join d.participants ps group by d.id";

        TypedQuery<ParticipantCount> query = em.createQuery(s, ParticipantCount.class);
        List<ParticipantCount> searchResults = query.getResultList();

        return searchResults;
    }
}
