package com.greenfoxacademy.foxclub.model;

import javax.persistence.*;

@Entity
public class Fox {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String tricks;
    private String food;
    private String drink;

    @ManyToOne(cascade = CascadeType.ALL)
    private FoxAccount foxAccount;


    public Fox(String name) {
        this.name = name;
    }

    public Fox() {

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTricks() {
        return tricks;
    }

    public void setTricks(String tricks) {
        this.tricks = tricks;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public FoxAccount getFoxAccount() {
        return foxAccount;
    }

    public void setFoxAccount(FoxAccount foxAccount) {
        this.foxAccount = foxAccount;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tricks='" + tricks + '\'' +
                ", food='" + food + '\'' +
                ", drink='" + drink + '\'' +
                ", foxAccount=" + foxAccount +
                '}';
    }
}
