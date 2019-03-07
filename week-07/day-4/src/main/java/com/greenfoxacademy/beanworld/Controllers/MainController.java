package com.greenfoxacademy.beanworld.Controllers;

import com.greenfoxacademy.beanworld.Model.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private UtilityService service;

    @Autowired
    public MainController(UtilityService utility) {
        this.service = utility;
    }

    @RequestMapping(value = "/useful")
    public String getUseful() {
        return "index";
    }

    @RequestMapping(value = "/useful/colored")
    public String getRandomBacground(Model model) {
        model.addAttribute("getRandomColor", service.randomColor());
        return "random";
    }

    @PostMapping(value = "/useful/email")
    public String postEmail(Model model, @RequestParam("email") String email) {
        model.addAttribute("email", email);
        String valid = service.validateEmail(email);
        model.addAttribute("validEmail", valid);
        return "index";
    }

    @GetMapping(value = "/useful/email")
    public String getemail() {
        return "index";
    }
}
