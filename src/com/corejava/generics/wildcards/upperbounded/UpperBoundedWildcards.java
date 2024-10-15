package com.corejava.generics.wildcards.upperbounded;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcards {
    public static void main(String[] args) {
        // ? Wildcards
        // Upper Bounded Wildcards
        List<Double> list1 = Arrays.asList(1.7, 2.53, 34.43);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
        List<Number> list3 = Arrays.asList();

        print(list1);
        print(list2);
    }

    static void print(List<? extends Number> List) {
        List.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }
}