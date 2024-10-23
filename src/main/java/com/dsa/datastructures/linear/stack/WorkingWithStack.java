package com.dsa.datastructures.linear.stack;

import java.util.Stack;

public class WorkingWithStack {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek at the top element
        System.out.println("Top element: " + stack.peek()); // Output: 30

        // Pop the top element
        System.out.println("Popped element: " + stack.pop()); // Output: 30

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
    }
}
