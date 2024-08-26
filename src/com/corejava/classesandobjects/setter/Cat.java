package com.corejava.classesandobjects.setter;

public class Cat {
    private String name;

    public void meow() {
        System.out.println(name + ": meow...");
    }

    public void setName(String name) {
        this.name = name;
    }
}
