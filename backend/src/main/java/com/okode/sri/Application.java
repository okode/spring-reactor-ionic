package com.okode.sri;

import java.time.Duration;
import java.time.Instant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@SpringBootApplication
@RestController
@CrossOrigin
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping(path = "/date/now/{durationSeconds}", produces = { "text/event-stream", "application/stream+json", "application/json" } )
    public Flux<Instant> now(@PathVariable int durationSeconds) {
        return Flux.interval(Duration.ofMillis(30)).map(i -> Instant.now()).take(Duration.ofSeconds(durationSeconds));
    }
    
}
