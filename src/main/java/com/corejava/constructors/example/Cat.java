package com.corejava.constructors.example;

public class Cat {
    private final String name;
    private final int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void meow() {
        System.out.println(name + ": Meow...");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
