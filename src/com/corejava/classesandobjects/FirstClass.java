package com.corejava.classesandobjects;

public class FirstClass {
    public static void main(String[] args) {
        //Object
        Cat cat = new Cat();
        cat.name = "Gyanu";
        cat.meow();
    }

    static class Cat {
        private String name;

        public void meow() {
            System.out.println(name + ": meow...");
        }
    }
}
