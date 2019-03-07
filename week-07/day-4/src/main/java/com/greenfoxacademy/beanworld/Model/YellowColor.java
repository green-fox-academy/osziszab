package com.greenfoxacademy.beanworld.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Yellow Color")
public class YellowColor implements MyColor {

    Printer printer;

    @Autowired
    public YellowColor(Printer printer){
        this.printer = printer;
    }

    @Override
    public void printColor(){
        System.out.println("It is yellow in color...");
    }
}
