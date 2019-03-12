package com.greenfoxacademy.tododatabase;

import com.greenfoxacademy.tododatabase.Model.Todo;
import com.greenfoxacademy.tododatabase.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TododatabaseApplication implements CommandLineRunner {

    @Autowired
    private TodoRepository todoRepository;

    public static void main(String[] args) {
        SpringApplication.run(TododatabaseApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("Do the workshop tasks"));
        todoRepository.save(new Todo("Do the next one"));
        todoRepository.save(new Todo("Eat"));
        todoRepository.save(new Todo("Thank to Zsófi the help."));
    }

}
