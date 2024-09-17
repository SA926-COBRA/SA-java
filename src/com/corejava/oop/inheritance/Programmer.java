package com.corejava.oop.inheritance;

public class Programmer extends Employee {

    private String[] programmingLanguage;

    public Programmer() {
    }

    public Programmer(String name, int age, String address, String experience) {
        super(name, age, address, experience);
    }

    public Programmer(String name, int age, String address, String experience, String[] programmingLanguage) {
        super(name, age, address, experience);
        this.programmingLanguage = programmingLanguage;
    }

    public void writeSomeCode() {
        super.sayHi();
        System.out.println(this.name + ": Writing some code.");
    }

    @Override
    public void sayHi() {
        System.out.println("Hello World");
    }
}
