package com.okode.sri.controller;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.okode.sri.service.DateService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/date")
@CrossOrigin
public class DateController {
    
    private DateService dateService;
    
    @Autowired
    public DateController(DateService dateService) {
        this.dateService = dateService;
    }

    // Produces: text/event-stream | application/stream+json
    @GetMapping(path = "/now/{durationSeconds}", produces = "application/stream+json")
    public Flux<Instant> now(@PathVariable int durationSeconds) {
        return dateService.now(durationSeconds);
    }

    
}
