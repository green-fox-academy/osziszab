package com.example.exam.controller;

import com.example.exam.model.Register;
import com.example.exam.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @GetMapping(value = "/")
    public String showRegisterPage(Model model) {
        model.addAttribute("newRegisters", new Register());
        //model.addAttribute("latestUsers",registerService.showLastUserName());
        model.addAttribute("latestUsers",registerService.usernameMaker());
        model.addAttribute("message",registerService.getMessage());
        return "index";
    }

    @PostMapping(value = "/register")
    public String saveNewRegister(@ModelAttribute("newRegisters") Register register) {
        registerService.saveRegister(register);
        return "redirect:/";
    }
}
