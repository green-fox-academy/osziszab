package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    public String x;
    public Integer ozituu;
    private AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam String name){
        Greeting greeting = new Greeting(counter,"Hello There!" + name) ;
        greeting.getId().getAndIncrement();
    return greeting;
    }

}
