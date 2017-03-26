package com.codedaesthetics.controller;

import com.codedaesthetics.domain.ParticipantCount;
import com.codedaesthetics.domain.Demo;
import com.codedaesthetics.repository.DemoRepository;
import com.codedaesthetics.repository.ParticipantCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by coded-aesthetics on 23.03.17.
 */
@Controller
@ExposesResourceFor(ParticipantCount.class)
@RequestMapping(value = "api/demoes")
public class ParticipantCountController{
    @Autowired
    private ParticipantCountRepository participantCountRepository;

    @Autowired
    private DemoRepository demoRepository;

    //@Autowired
    //ParticipantCountResourceAssembler participantCountResourceAssembler;

    @RequestMapping(value = "search/getParticipantCounts", method = RequestMethod.GET)
    public ResponseEntity<List<ParticipantCount>> getParticipantCounts() {
        List<ParticipantCount> first = participantCountRepository.getParticipantCounts();

        return new ResponseEntity<List<ParticipantCount>>(first, HttpStatus.OK);
    }

    @RequestMapping(value = "search/getParticipantCountsByDemoRepo", method = RequestMethod.GET)
    public ResponseEntity<List<ParticipantCount>> getParticipantCountsByDemoRepo() {
        List<ParticipantCount> first = demoRepository.findParticipantCounts();
        return new ResponseEntity<>(first, HttpStatus.OK);
    }
}