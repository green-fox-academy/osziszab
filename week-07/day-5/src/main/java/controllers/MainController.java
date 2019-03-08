package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping(value="/index")
    public String home(){
        return "index";
    }
    @PostMapping(value = "/login")
    public String postLoginName(Model model, @RequestParam("login") String name) {
        model.addAttribute("login", name);
        return "login";
    }

    @GetMapping(value = "/login")
    public String getLoginName() {
        return "login";
    }
}
