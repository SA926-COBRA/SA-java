package com.corejava.keywords.statickeyword.statickeyword1;

public class WithoutUsingStaticKeyword {
    // Instance Variable
    int count = 0;

    // Constructor (which is called when an object of the class is created)
    public WithoutUsingStaticKeyword() {
        System.out.println("Hello from Constructor");
    }

    // Instance Method
    void incrementCount() {
        count++;
        System.out.println("Count : " + count);
    }

    public static void main(String[] args) {
        // Create an instance of the class (constructor called)
        WithoutUsingStaticKeyword obj = new WithoutUsingStaticKeyword();

        // Accessing the instance variable using object
        System.out.println("Initial Count : " + obj.count);

        // Modifying the instance variable
        obj.count += 5;

        obj.incrementCount();
    }
}
