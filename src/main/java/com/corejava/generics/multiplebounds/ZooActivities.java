package com.corejava.generics.multiplebounds;

// A class and two interfaces
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

// Generic class with multiple bounds
public class ZooActivities<T extends Animal & Swimmable & Flyable> {
    private T animal;

    public ZooActivities(T animal) {
        this.animal = animal;
    }

    public void performActivities() {
        animal.eat();   // Inherited from Animal class
        animal.swim();  // Implemented from Swimmable interface
        animal.fly();   // Implemented from Flyable interface
    }
}

// A class that satisfies all bounds (extends Animal and implements Swimmable & Flyable)
class Duck extends Animal implements Swimmable, Flyable {
    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}

class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        ZooActivities<Duck> zoo = new ZooActivities<>(duck);
        zoo.performActivities();  // Outputs: Animal is eating, Duck is swimming, Duck is flying
    }
}
