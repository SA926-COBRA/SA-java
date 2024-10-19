package com.corejava.keywords.abstractkeyword;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Tommy");
        Animal cat = new Cat("Meow");

        dog.makeSound();
        cat.makeSound();
    }
}
