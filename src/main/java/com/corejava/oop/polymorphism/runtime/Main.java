package com.corejava.oop.polymorphism.runtime;

// Parent class
class Animal {
    // Method that can be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class Dog that overrides the sound method
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Child class Cat that overrides the sound method
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Animal reference and object
        Animal myDog = new Dog();        // Animal reference, Dog object
        Animal myCat = new Cat();        // Animal reference, Cat object

        myAnimal.sound();  // Calls Animal's sound method
        myDog.sound();     // Calls Dog's sound method
        myCat.sound();     // Calls Cat's sound method
    }
}

