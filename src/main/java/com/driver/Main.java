package com.driver;

public class Main {
  public static void main(String args[]){
        RWOnly a=new RWOnly();
        //try, setting a value to name, by directly accessing it using obj and also try printing it
        //The field RWOnly.name is not visible
        //a.name="venky";
        a.setName("venky");
        System.out.println(a.getName());
    }
