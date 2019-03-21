package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.model.Fox;
import com.greenfoxacademy.foxclub.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FoxController {

    @Autowired
    private FoxService foxService;

    @GetMapping(value = "/{id}")
    public String showFox(@PathVariable(value = "id") Long id,Model model){
        model.addAttribute("thisFox",foxService.findbíId(id));
        return "index";
    }

    @GetMapping(value = "/yourFoxes/{id}")
    public String showAccountFoxes(Model model,@PathVariable long id){
        model.addAttribute("foxes",foxService.showAllfoxes());
        model.addAttribute("userId",id);
        return "AccountPage";
    }

    @GetMapping(value = "/addnewFox/{id}")
    public String showLogin(Model model,@ModelAttribute("newFox") Fox fox, @PathVariable long id  ){
        model.addAttribute("userId",id);
        return "addFox";
    }

    @PostMapping(value = "/addnewFox/{id}")
    public String associateFox(@ModelAttribute("newFox") Fox fox, @PathVariable long id){
        foxService.saveFox(fox, id);
        return "redirect:/yourFoxes/"+id;
    }
}
