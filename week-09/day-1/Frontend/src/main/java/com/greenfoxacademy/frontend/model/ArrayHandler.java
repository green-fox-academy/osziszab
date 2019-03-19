package com.greenfoxacademy.frontend.model;

import java.util.Arrays;

public class ArrayHandler {

    private Object result;

    public ArrayHandler(String what, UserArray userArray) {
        if (what.equals("sum")) {
            this.result = Arrays.stream(userArray.getArray())
                    .mapToInt(Integer::intValue).sum();

        } else if (what.equals("multiply")) {
            int temp = 1;
            for (int i : userArray.getArray()) {
                temp*=i;
            }
            result=temp;

        } else if (what.equals("double")) {
            this.result = Arrays.stream(userArray.getArray())
                    .map(s -> s * 2)
                    .toArray();
        }

    }

}
