package com.greenfoxacademy.springstart.controllers;

public class Greeting {

   private long id;
   private String content;

   public Greeting(int id, String content){
       this.id = id;
       this.content = content;
   }

   public long getId(){
       return id;
   }

   public String getContnet(){
       return content;
   }
}
