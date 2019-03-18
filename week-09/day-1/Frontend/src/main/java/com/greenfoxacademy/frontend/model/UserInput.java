package com.greenfoxacademy.frontend.model;

public class UserInput {

    private Integer received;
    private int result;

    public UserInput(int received) {
        this.received = received;
    }

    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void doublingInputNumber() {
        result = received * 2;
    }
}
