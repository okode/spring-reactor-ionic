package com.okode.sri.service;

import java.time.Duration;
import java.time.Instant;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
public class DateService {
    
    public Flux<Instant> now() {
        return Flux.interval(Duration.ofMillis(30)).map(i -> Instant.now());
    }
    
}
