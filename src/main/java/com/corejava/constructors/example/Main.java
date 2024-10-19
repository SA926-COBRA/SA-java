package com.corejava.constructors.example;

public class Main {
    public static void main(String[] args) {
        Cat rose = new Cat("Rose", 2);

        rose.meow();
        System.out.println("Name : " + rose.getName());
        System.out.println("Age : " + rose.getAge());
    }
}
