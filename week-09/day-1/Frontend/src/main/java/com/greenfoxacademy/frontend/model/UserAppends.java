package com.greenfoxacademy.frontend.model;

public class UserAppends {

    private String appended;

    public UserAppends(String appended) {
        this.appended = appended + "a";
    }

    public String getAppended() {
        return appended;
    }
}
