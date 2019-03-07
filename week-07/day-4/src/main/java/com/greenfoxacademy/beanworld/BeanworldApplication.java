package com.greenfoxacademy.beanworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanworldApplication implements CommandLineRunner {

private Printer printer;

    @Autowired
    BeanworldApplication(Printer printer) {
        this.printer = printer;
    }

    public static void main(String[] args) {
        SpringApplication.run(BeanworldApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("Hello");
    }
}
