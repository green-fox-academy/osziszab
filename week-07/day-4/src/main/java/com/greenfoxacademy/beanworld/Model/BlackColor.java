package com.greenfoxacademy.beanworld.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Black Color")
public class BlackColor implements MyColor {

    Printer printer;

    @Autowired
    public BlackColor(Printer printer){
        this.printer = printer;
    }

    @Override
    public  void  printColor(){
        System.out.println("It is black in color...");
    }
}
