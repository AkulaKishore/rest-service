package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class GreetingsController {
    public static final String template = "Hello, %s";
    public final AtomicInteger counter = new AtomicInteger();

    @GetMapping("/greetings")
    public Greetings greetings(@RequestParam(value ="name",defaultValue = "World")String name){
        return new Greetings(counter.getAndIncrement(),name);
    }
}
