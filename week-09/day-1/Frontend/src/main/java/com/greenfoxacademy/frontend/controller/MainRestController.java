package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.ErrorMassage;
import com.greenfoxacademy.frontend.model.Greeting;
import com.greenfoxacademy.frontend.model.UserInput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {


    @GetMapping(value = "/doubling")
    public Object doublingNumber(@RequestParam(name = "input", required = false) Integer number) {
        ErrorMassage errorMassage = new ErrorMassage();
        if (number != null) {
            UserInput userInput = new UserInput(number);
            userInput.doublingInputNumber();
            return userInput;
        } else {
            errorMassage.getNumberMissingError();
            return errorMassage;
        }
    }

    @GetMapping(value = "/greeter")
    public Object greetUser(@RequestParam(name = "name", required = false) String name, @RequestParam(name = "title", required = false) String title) {
        ErrorMassage errorMassage = new ErrorMassage();
        if (name != null && title != null) {
            Greeting greeting1 = new Greeting(name, title);
            return greeting1;
        } else {
            errorMassage.errorMissingTitleAndName();
            return errorMassage;
        }
        if (name == null && title != null) {

        }
    }
}
