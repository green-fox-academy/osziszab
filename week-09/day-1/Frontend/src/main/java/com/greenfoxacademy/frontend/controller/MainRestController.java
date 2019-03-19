package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {


    @GetMapping(value = "/doubling")
    public Object doublingNumber(@RequestParam(name = "input", required = false) Integer number) {
        ErrorMassage errorMassage = new ErrorMassage("Please provide an input!");
        if (number != null) {
            UserInput userInput = new UserInput(number);
            userInput.doublingInputNumber();
            return userInput;
        } else {
            return errorMassage;
        }
    }

    @GetMapping(value = "/greeter")
    public Object greetUser(@RequestParam(name = "name", required = false) String name, @RequestParam(name = "title", required = false) String title) {
        if (name != null && title != null) {
            Greeting greeting1 = new Greeting(name, title);
            return greeting1;
        } else if(name==null && title==null){
            ErrorMassage errorMassage = new ErrorMassage("Please provide a name and a title!");
            return errorMassage;
        }else if (name == null && title != null) {
            ErrorMassage errorMassage1 = new ErrorMassage("Please provide a name!");
            return errorMassage1;
        }else{
            ErrorMassage errorMassage2 = new ErrorMassage("Please provide a title!");
            return errorMassage2;
        }
    }

    @GetMapping(value = "/appenda/{appendable}")
    public Object appendA(@PathVariable String appendable){
        return new UserAppends(appendable);
    }

    @PostMapping(value = "/dountil/{action}")
    public Object doUntil(@PathVariable("action") String action, @RequestBody(required = false) Until until){
        if(until==null){
            return new ErrorMassage( "Please provide a number!");
        }else {
            return new UserDoUntil(action,until);
        }
    }

    @PostMapping(value = "/arrayHandler/{what}")
    public Object arrayhandle(@PathVariable("what") String what, @RequestBody UserArray numbers){
        if(what == null){
            return new ErrorMassage("Please provide what to do with the numbers!");
        }else{
            return new ArrayHandler(what,numbers);
        }
    }
}
