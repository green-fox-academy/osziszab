package com.greenfoxacademy.simbank.Controller;

import com.greenfoxacademy.simbank.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    BankAccount animal1 = new BankAccount("Zebra",2000,"zebra");

    @RequestMapping(value = "/show")
    public String showAccount(Model model) {
        model.addAttribute("showAccount", animal1);
        return "index";
    }
}
