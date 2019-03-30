package com.greenfoxacademy.demo.controllers;


import com.greenfoxacademy.demo.Model.FoxList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

FoxList foxes;

   @Autowired
   public MainController(FoxList foxes){
        this.foxes = foxes;
   }

    @GetMapping (value="/")
    public String home(@RequestParam(value = "name", required = false, defaultValue = "Mr. Fox") String name, Model model){
        model.addAttribute("login", name);
        model.addAttribute("fox",foxes.getFox(name));
        return "index";
    }

    @PostMapping(value = "/login")
    public String postLoginName( String name) {
       return "redirect:/?name=" + name;
        }

    @GetMapping(value = "/login")
    public String getLoginName() {
        return "login";
    }
}
