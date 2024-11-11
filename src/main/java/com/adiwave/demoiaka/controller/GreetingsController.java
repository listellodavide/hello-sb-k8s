package com.adiwave.demoiaka.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class GreetingsController {
    @GetMapping(value = "/hello", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> hello() {
        return Flux.just("Hello World!", "Buenjorno Monod", "Salut lume", "iaka")
                .delayElements(Duration.ofMillis(500));
    }
}
