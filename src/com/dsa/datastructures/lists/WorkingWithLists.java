package com.dsa.datastructures.lists;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");

        System.out.println(colors);
        System.out.println(colors.size());

        System.out.println(colors.remove("red"));
        System.out.println(colors);

        System.out.println();

        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));

        for (String color : colors) {
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        // Creating immutable list
        List<String> colorsUnmodifiable = List.of(
                "Yellow",
                "Red",
                "Purple",
                "Green"
        );
//      Cannot perform remove, add or any other modifiable action
//      colorsUnmodifiable.remove("Yellow");
//      colorsUnmodifiable.add("Pink");

        System.out.println(colorsUnmodifiable);

        List<Integer> numbers = new ArrayList<>();

        // Initializing List
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers.size());
        numbers.remove(1);
        System.out.println(numbers);
        System.out.println(numbers.contains(2));
        System.out.println(numbers.contains(1));
        System.out.println(numbers.add(2));
        System.out.println(numbers);
    }
}
