package com.greenfoxacademy.springstart.controllers;

public class Greeting {

   private long id;
   private String contnet;

   public Greeting(int id, String contnet){
       this.id = id;
       this.contnet = contnet;
   }

   public long getId(){
       return id;
   }

   public String getContnet(){
       return contnet;
   }
}
