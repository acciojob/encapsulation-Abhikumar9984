package com.driver;

public class RWOnly {
    private static String Name;

    public RWOnly(String name) {
        this.Name = name;
    }

    public static String getName() {
        return Name;
    }

    public static void setName(String name) {
        Name = name;
    }
}
