package com.greenfoxacademy.frontend.model;

public class ErrorMassage {

    private String error;

    public ErrorMassage() {

    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void getNumberMissingError() {
        error = "Please provide an input!";
    }

    public void errorMissingTitleAndName() {
        error = "Please provide a name and a title!";
    }

    public void errorMissingName() {
        error = "Please provide a name!";
    }

    public void errorMissingTitle() {
        error = "Please provide a title!";
    }

}
