package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

   private AtomicLong id;
   private String content;

   public Greeting(AtomicLong id, String content){
       this.id = id;
       this.content = content;
   }

   public AtomicLong getId(){
       return id;
   }

   public String getContent(){
       return content;
   }
}
