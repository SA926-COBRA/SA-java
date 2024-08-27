package com.corejava.constructors.parameterized;

public class Main {
    public static void main(String[] args) {
        // Creating a Cat object using the parameterized constructor
        Cat cat1 = new Cat("Gyanu", 1);
        cat1.displayInfo(); // Displaying the cat's information

        // Using setters to update the cat's information
        cat1.setName("Juli");
        cat1.setAge(1);

        // Using getters to access the cat's information
        System.out.println("Updated name: " + cat1.getName());
        System.out.println("Updated age: " + cat1.getAge());

        // Accessing cat's information using Method
        cat1.displayInfo();
    }
}
