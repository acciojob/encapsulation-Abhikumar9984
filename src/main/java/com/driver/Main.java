package com.driver;

public class Main {

    public static void main(String args[]){
        RWOnly r  = new RWOnly("Abhishek");

        r.setName("Aditi" , 172);
        System.out.println(r.getName(160));
    }
}