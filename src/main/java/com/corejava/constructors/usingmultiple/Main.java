package com.corejava.constructors.usingmultiple;

public class Main {
    public static void main(String[] args) {
        Baby baby1 = new Baby();
        baby1.setGender("Female");
        System.out.println(baby1.getName());
        System.out.println(baby1.getAge());
        System.out.println(baby1.getGender());

        System.out.println();

        Baby baby2 = new Baby("Male");
        System.out.println(baby2.getName());
        System.out.println(baby2.getAge());
        System.out.println(baby2.getGender());

        System.out.println();

        Baby baby3 = new Baby("Female", "Riyanshi", 2);
        System.out.println(baby3.getName());
        System.out.println(baby3.getAge());
        System.out.println(baby3.getGender());
    }
}
