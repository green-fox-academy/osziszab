package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRESTController {

    @RequestMapping(value="/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam ("name") String name){
        Greeting greeting = new Greeting(1,"Hello There!" + name) ;
    return greeting;
    }

}
