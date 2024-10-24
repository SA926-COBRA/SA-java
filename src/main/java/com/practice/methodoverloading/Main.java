package com.practice.methodoverloading;

public class Main {
    public static void main(String[] args) {
        // Create Dog object
        Dog dog = new Dog();
        dog.bark(); // Calls bark() with no parameters
        dog.bark(3); // Calls bark(int times)
        dog.bark("Bow wow!"); // Calls bark(String sound)

        // Create Cat object
        Cat cat = new Cat();
        cat.meow(); // Calls meow() with no parameters
        cat.meow(2); // Calls meow(int times)
        cat.meow("Purr meow!"); // Calls meow(String sound)
    }
}