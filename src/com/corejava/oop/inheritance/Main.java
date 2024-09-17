package com.corejava.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        String[] languages = {"Java", "C++", "Go"};

        Programmer java = new Programmer(
                "Nirmal",
                21,
                "London",
                "Full Stack"
        );
        java.sayHi();

        java.writeSomeCode();
        System.out.println(java.getName());
        System.out.println(java.getAddress());
        System.out.println(java.getAge());
        System.out.println(java.getExperience());
    }
}
