package com.driver;

public class RWOnly {
    private  String Name;

    public RWOnly(String name) {
        this.Name = name;
        System.out.println(this.Name);
    }

    public String getName(int priority) {
        if(priority>=150)
          return Name;
        else
            return "You not elligible";
    }

    public void setName(String name , int priority) {
        if(priority>=150)
          this.Name = name;
        else
            return;
    }
}
