package com.corejava.classesandobjects.setter;

public class Cat {
    private String name;

    public void meow() {
        System.out.println(name + ": meow...");
    }

    public void setname(String name) {
        this.name = name;
    }
}
