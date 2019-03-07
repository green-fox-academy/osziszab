package Controllers;

import com.greenfoxacademy.beanworld.Model.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.awt.SunHints;

@Controller
public class MainController {

    private UtilityService service;

    @Autowired
    public MainController(UtilityService utility){
        this.service = utility;
    }

    @RequestMapping(value = "/useful")
    public String getUseful(){
        return "index";
    }
    @RequestMapping(value = "/useful/colored")
    public String getRandomBacground(Model model){


        return "random";
    }
}
