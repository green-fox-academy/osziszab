package com.greenfoxacademy.beanworld.Model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class UtilityService {
    ArrayList<String> colors;
    Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public String validateEmail(String email) {
        String result = "";

        if (email.contains("@") && email.contains(".")) {
            result = "<span style=\"color:green\">" + email + " is a valid email address ";
        } else {
            result = "<span style=\"color:red\">" + email + "is  not a valid email address";
        }
        return result;
    }
}

