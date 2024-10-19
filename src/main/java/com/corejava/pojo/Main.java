package com.corejava.pojo;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person person1 = new Person("Krishna", 25);

        // Accessing the properties using getters
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        // Modifying the properties using setters
        person1.setName("John Doe");
        person1.setAge(30);

        // Printing the updated properties
        System.out.println("Updated Name: " + person1.getName());
        System.out.println("Updated Age: " + person1.getAge());

        // Using the toString method to display the person's information
        System.out.println(person1.toString());
    }
}
