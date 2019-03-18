package com.greenfoxacademy.frontend.model;

public class Greeting {

    private String welcome_massage;
    private String name;
    private String title;

    public Greeting(String name, String title) {
        this.welcome_massage = "Oh, hi there " + name+", my dear "+ title+"!";
    }

    public String getWelcome_massage() {
        return welcome_massage;
    }

    public void setWelcome_massage(String welcome_massage) {
        this.welcome_massage = welcome_massage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
