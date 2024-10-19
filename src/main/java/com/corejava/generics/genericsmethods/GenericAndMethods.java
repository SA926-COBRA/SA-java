package com.corejava.generics.genericsmethods;

public class GenericAndMethods {
    public static void main(String[] args) {
        String[] names = {"Krishna", "Bibechana"};
        Character[] letters = {'a', 'b', 'c'};
        Integer[] numbers = {1, 2, 3};

        print(names);
        print(letters);
        print(numbers);
    }

    static <T> void print(T[] array) {
        for (T e : array) {
            System.out.println(e.getClass().getName() + " - " + e);
        }
    }
}
