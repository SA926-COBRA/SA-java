package com.dsa.arrays.basic;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        // Declaring an array of Strings with 5 Elements
        String[] colors = new String[5];

        // Initialize the array
        colors[0] = "Purple";
        colors[1] = "Red";
        colors[2] = "Green";

        System.out.println(Arrays.toString(colors));

        // Accessing elements in the array.
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        // Modifying existing value.
        colors[2] = "Yellow";
        System.out.println(Arrays.toString(colors));

        // Declaring and Initializing at once.
        int[] numbers = {1, 2, 3, 4, 5};

        // Looping through the array using traditional for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println();

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        // Print the size of array
        System.out.println(colors.length);

        System.out.println();

        // Looping through the array using Enhanced for loop
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println();

        // Using stream to loop through
        Arrays.stream(colors).forEach(System.out::println);
    }
}
