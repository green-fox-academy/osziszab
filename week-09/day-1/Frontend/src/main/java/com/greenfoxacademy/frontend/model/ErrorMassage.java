package com.greenfoxacademy.frontend.model;

public class ErrorMassage {

    private String error;

    public ErrorMassage() {
        this.error = "Please provide an input!";
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
