package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.models.ShopItem;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private List<ShopItem> itemList = new ArrayList<>();

    public MainController(){
        itemList.add(new ShopItem("Running Shoes","Nike running shoes for every day sport",1000 ,5));
        itemList.add(new ShopItem("Printer","Some HP printer that will print pages",3000,2));
        itemList.add(new ShopItem("Coca Cola","0,5l standard coke",25,0));
        itemList.add(new ShopItem("T-shirt","Bluew with a corgi ona a bike",300,1));
    }

}
