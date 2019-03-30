package com.greenfoxacademy.demo.Model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoxList {

    private List<Fox> foxes;

    public FoxList(){
        foxes = new ArrayList<>();
        Fox fox = new Fox("Weed", Arrays.asList("eat", "play", "fight","smoke"),"salami", "cola");
        Fox fox1 = new Fox("Shoe", Arrays.asList("swim", "run", "learn"),"hamburger", "beer");
        Fox fox2 = new Fox("Mario", Arrays.asList("read", "flex"),"cheese", "fanta");
        Fox fox3 = new Fox("Scar", Arrays.asList("jump", "code"),"meat", "water");

        foxes.add(fox);
        foxes.add(fox1);
        foxes.add(fox2);
        foxes.add(fox3);
    }
    public List<Fox> getFoxList() {
        return foxes;
    }

    public void addFox(Fox fox) {
        this.foxes.add(fox);
    }

    public Fox getFox(String name){
        for (Fox fox:this.foxes) {
            if (fox.getName().equalsIgnoreCase(name)){
                return fox;
            }
        }
        return null;
    }
}
