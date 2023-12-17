package com.driver;

public class RWOnly {
    private  String Name;

    public RWOnly(String name) {
        this.Name = name;
        System.out.println(this.Name);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
}
