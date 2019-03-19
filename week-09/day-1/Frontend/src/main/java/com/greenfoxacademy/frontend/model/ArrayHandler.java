package com.greenfoxacademy.frontend.model;

import java.util.Arrays;

public class ArrayHandler {

    private Object result;

    public ArrayHandler( UserArray userArray) {
        if (userArray.getWhat().equals("sum")) {
            this.result = Arrays.stream(userArray.getNumbers())
                    .sum();

        } else if (userArray.getWhat().equals("multiply")) {
            int temp = 1;
            for (int i : userArray.getNumbers()) {
                temp *= i;
            }
            result = temp;

        } else if (userArray.getWhat().equals("double")) {
            this.result = Arrays.stream(userArray.getNumbers())
                    .map(s -> s * 2)
                    .toArray();
        }

    }

    public Object getResult() {
        return result;
    }
}
