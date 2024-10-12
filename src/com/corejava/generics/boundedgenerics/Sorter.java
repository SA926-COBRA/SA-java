package com.corejava.generics.boundedgenerics;

import java.util.Arrays;

// T is bounded by Comparable, meaning it can only be a type that implements Comparable (e.g., String, Integer, etc.)
public class Sorter<T extends Comparable<T>> {

    // Method to sort an array of elements
    public void sort(T[] array) {
        Arrays.sort(array);
    }

    // Method to print the sorted array
    public void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

class main {
    public static void main(String[] args) {
        // Sorting an array of Integers
        Sorter<Integer> intSorter = new Sorter<>();
        Integer[] intArray = {5, 3, 8, 1, 2};
        intSorter.sort(intArray);
        System.out.print("Sorted Integer array: ");
        intSorter.printArray(intArray);

        // Sorting an array of Strings
        Sorter<String> stringSorter = new Sorter<>();
        String[] stringArray = {"Apple", "Orange", "Banana", "Pear"};
        stringSorter.sort(stringArray);
        System.out.print("Sorted String array: ");
        stringSorter.printArray(stringArray);
    }
}