package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.model.FoxAccount;
import com.greenfoxacademy.foxclub.service.FoxAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxAccountController {

    @Autowired
    private FoxAccountService foxAccountService;

    @GetMapping(value = "/createProfile")
    public String creatNewAccount(Model model, FoxAccount foxAccount){
        model.addAttribute("newAccount",new FoxAccount());
        return "createProfile";
    }

    @PostMapping(value = "/createProfile")
    public String addNewAccount(@ModelAttribute("newAccount") FoxAccount foxAccount ){
        foxAccountService.saveAccount(foxAccount);
        return "redirect:/main";
    }

    @GetMapping(value = "/main")
    public String showMainPage(@ModelAttribute("loginAccount")FoxAccount account, @RequestParam(value = "username",required = false) String username,@RequestParam(value = "password",required = false) String password) {
        Long accountId = foxAccountService.getTheAccount(account.getName(),account.getPassword());
        if(accountId!=null){
            return "redirect:/yourFoxes/"+accountId;
        }

        return "mainpage";
    }
}
