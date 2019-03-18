package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.UserInput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {


    @GetMapping(value = "/doubling")
    public UserInput doublingNumber(@RequestParam ("input") int number){
        UserInput userInput = new UserInput(number);
        userInput.doublingInputNumber();
        return userInput;
    }
}
