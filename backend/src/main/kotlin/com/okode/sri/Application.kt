package com.okode.sri

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import java.time.Duration
import java.time.Instant

@SpringBootApplication
@RestController
@CrossOrigin
class Application {

    @GetMapping(
            path = arrayOf("/date/now/{durationSeconds}"),
            produces = arrayOf(
                    "text/event-stream",
                    "application/stream+json",
                    "application/json"))
    fun now(@PathVariable durationSeconds: Long) = Flux
            .interval(Duration.ofMillis(30))
            .map { _ -> Instant.now() }
            .take(Duration.ofSeconds(durationSeconds))

}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
