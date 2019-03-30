package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class SayHello {

    private AtomicLong webCounter = new AtomicLong();
    private String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
    private Color[] colors = {Color.red,Color.cyan,Color.black,Color.gray,Color.green,Color.BLUE,Color.orange};

    @RequestMapping("/web/greeting1")
    public String greeting(@RequestParam String name, Model model) {
        String random = hellos[(int) (Math.random() * hellos.length + 1)];
        model.addAttribute("name", name);
        model.addAttribute("hello", random);
        model.addAttribute("loadCounter", webCounter);
        webCounter.getAndIncrement();
        return "hello";
    }
}
