package com.greenfoxacademy.frontend.model;

public class UserDoUntil {

    private int result;

    public UserDoUntil(String action, Until until) {
        if (action.equals("sum")) {
            this.result = until.getUntil();
            for (int i = 1; i < until.getUntil(); i++) {
                this.result += i;
            }
        } else if (action.equals("factor")) {
            this.result = until.getUntil();
            for (int i = 1; i < until.getUntil(); i++) {
                this.result *= i;
            }
        }
    }

    public int getResult() {
        return result;
    }

    public void setResult() {
        this.result = result;
    }
}
