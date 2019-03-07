package com.greenfoxacademy.beanworld;

import com.greenfoxacademy.beanworld.Model.MyColor;
import com.greenfoxacademy.beanworld.Model.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanworldApplication implements CommandLineRunner {

    private MyColor color;

    @Autowired
   public BeanworldApplication(@Qualifier("Black Color")MyColor color) {
        this.color = color;
    }

    public static void main(String[] args) {
        SpringApplication.run(BeanworldApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        this.color.printColor();
    }
}
