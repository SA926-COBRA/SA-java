package com.corejava.keywords.var;

import java.util.Arrays;

public class Main {
    //      The var keyword was introduced in Java 10, which automatically detects the type of data
    //      This concept is known "Type Inference"
    //      It will only work in local variable

    //      private var name = "Krishna Bishowkarma";
    public static void main(String[] args) {
        var name = "Krishna";
        var age = 25;
        var bankBalance = 1_000_000.25;
        var isAdult = true;
        var pets = new String[]{"Meow", "Tommy"};

        System.out.println("My name is " + name + ", My age is " + age + ", My bank balance is " + bankBalance + ". My pets name is " + Arrays.toString(pets));
    }
}
