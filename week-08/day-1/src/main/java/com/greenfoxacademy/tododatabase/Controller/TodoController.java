package com.greenfoxacademy.tododatabase.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    @RequestMapping(value = {"/","/list"})
    @ResponseBody
    public String list(){
        return "This is my first Todo";
    }
}
