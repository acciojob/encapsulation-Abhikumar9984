package com.driver;

public class Main {
    public Main() {
    }

    public static void main(String[] args){

        RWOnly r  = new RWOnly();

       // System.out.println(r.Name);
        //java: Name has private access in com.driver.RWOnly

        r.setName("Aditi");
        String name  = r.getName();

        System.out.println(name);
    }

}