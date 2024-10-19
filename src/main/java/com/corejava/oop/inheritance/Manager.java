package com.corejava.oop.inheritance;

public class Manager extends Employee {
    private int teamSize;
    public Manager() {
    }

    public Manager(String name, int age, String address, String experience) {
        super(name, age, address, experience);
    }

    public void report(){
        System.out.println("Manager writing team report");
    }
}
