package com.greenfoxacademy.beanworld.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
@Qualifier("Red Color")
public class RedColor implements MyColor {

    private Printer printer;

    @Autowired
    public RedColor(Printer printer){
        this.printer = printer;
    }

    @Override
    public void printColor(){
        System.out.println("\"It is red in color...\"");
    }
}
