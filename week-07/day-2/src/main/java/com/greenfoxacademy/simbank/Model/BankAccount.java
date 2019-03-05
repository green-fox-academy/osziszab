package com.greenfoxacademy.simbank.Model;

public class BankAccount {

    private String name;
    private Double balance;
    private String animalType;
    private boolean king;
    private boolean badOrGood;

    public BankAccount(String name, double balance, String animalType, boolean king, boolean badOrGood) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.king = king;
        this.badOrGood = badOrGood;

    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public boolean isKing(){
        return king;
    }

}
