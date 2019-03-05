package com.greenfoxacademy.simbank.Controller;

import com.greenfoxacademy.simbank.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private BankAccount animal1 = new BankAccount("Zebra", 2000, "donkey");
    private List<BankAccount> bankAccountList = new ArrayList<>();

    public MainController(){
        bankAccountList.add(new BankAccount("Mufasa",5000,"lion"));
        bankAccountList.add(new BankAccount("Pumba",1000,"pig"));
        bankAccountList.add(new BankAccount("Timon",500,"Surikata"));
        bankAccountList.add(new BankAccount("Zordon",6000,"lion"));
        bankAccountList.add(new BankAccount("Zazu",300,"bird"));
    }

    @RequestMapping(value = "show")
    public String showAccount(Model model) {
        model.addAttribute("showAccount", animal1);
        return "index";
    }

    @RequestMapping(value = "raw")
    public String printText(Model model) {
        String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("givetext", text);
        return "raw";
    }

    @RequestMapping(value = "characters")
    public String getCharacters(Model model){
        model.addAttribute("getCharacters",bankAccountList);
        return "characters";
    }

}
