package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MainController {

    private List<ShopItem> itemList = new ArrayList<>();

    public MainController() {
        itemList.add(new ShopItem("Running Shoes", "Nike running shoes for every day sport", 1000, 5));
        itemList.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2));
        itemList.add(new ShopItem("Coca Cola", "0,5l standard coke", 25, 0));
        itemList.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100));
        itemList.add(new ShopItem("T-shirt", "Bluew with a corgi ona a bike", 300, 1));
    }

    @RequestMapping(value = "/home")
    public String allItem(Model model) {
        model.addAttribute("allItem", itemList);
        return "index";
    }

    @RequestMapping(value = "/only-available")
    public String onlyAvailable(Model model) {
        List<ShopItem> avaliables = itemList.stream()
                .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
                .collect(Collectors.toList());
        model.addAttribute("onlyAvailable", avaliables);
        return "avaliable";
    }

    @RequestMapping(value = "/cheapest-first")
    public String cheapestFirst(Model model) {
        model.addAttribute("cheapestFirst", itemList.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice)
                ).collect(Collectors.toList()));
        return "cheapest";
    }

    @RequestMapping(value = "contains-nike")
    public String containsNike(Model model) {
        List<ShopItem> nike = itemList.stream()
                .filter(shopItem -> shopItem.getDescription().contains("Nike") || shopItem.getDescription().contains("nike") || shopItem.getName().contains("Nike") || shopItem.getName().contains("nike"))
                .collect(Collectors.toList());
        model.addAttribute("containsNike", nike);
        return "nike";
    }

    @RequestMapping(value = "average-stock")
    public String avrageStock(Model model) {
        double avrage = itemList.stream()
                .mapToInt(ShopItem::getQuantityOfStock)
                .summaryStatistics()
                .getAverage();
        model.addAttribute("avrageStock", avrage);
        return "avrage";
    }

    @RequestMapping(value = "most-expensive")
    public String mostExpensive(Model model) {
        ShopItem veryExpensive = itemList.stream()
                .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
                .max(Comparator.comparing(ShopItem::getPrice))
                .get();
        String result = veryExpensive.getName();
        model.addAttribute("mostExpensive", result);
        return "expensive";
    }

    @PostMapping(value = "/home/search")
    public String search(Model model, @RequestParam("searchField") String keyword) {
        List<ShopItem> returnSearchResultList = itemList.stream()
                .filter(shopItem -> shopItem.getName().toLowerCase().contains(keyword.toLowerCase()) ||
                        shopItem.getDescription().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
        model.addAttribute("items", returnSearchResultList);
        return "searchResult";
    }
}
