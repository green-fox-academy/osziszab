package com.greenfoxacademy.demo.Model;

import java.util.ArrayList;
import java.util.List;

public class Fox {

    private String name;
    private List<String> trick = new ArrayList<>();
    private String food;
    private String drink;


    public Fox(String name, List<String> trick, String food, String drink) {

        this.name = name;
        this.food =food;
        this.drink = drink;
        this.trick = trick;

    }

    public String getName() {
        return name;
    }

    public String getDrink(){
        return drink;
    }

    public String getFood(){
        return food;
    }

    public List<String> getTrick(){
        return trick;
    }

}
