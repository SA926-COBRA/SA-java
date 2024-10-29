package com.practice.generics;

class GenericStack<T> {
    private int maxSize;
    private int top;
    private T[] stackArray;

    @SuppressWarnings("unchecked")
    public GenericStack(int size) {
        this.maxSize = size;
        this.top = -1;
        this.stackArray = (T[]) new Object[size];
    }

    public void push(T value) {
        if (isFull()) {
            System.out.println("Stack is full! Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return null;
        } else {
            T value = stackArray[top--];
            System.out.println("Popped: " + value);
            return value;
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! No top element.");
            return null;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

public class Main {
    public static void main(String[] args) {
        // Integer stack example
        GenericStack<Integer> intStack = new GenericStack<>(3);
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.pop();
        intStack.peek();

        // String stack example
        GenericStack<String> stringStack = new GenericStack<>(2);
        stringStack.push("Java");
        stringStack.push("Generics");
        stringStack.pop();
        stringStack.peek();
    }
}