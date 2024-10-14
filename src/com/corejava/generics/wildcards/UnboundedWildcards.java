package com.corejava.generics.wildcards;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class UnboundedWildcards {
    public static void main(String[] args) {
        // ? Wildcards
        // Unbounded Wildcards
        List<Object> list1 = Arrays.asList("1", 2, 3, new Date());
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
        List<String> list3 = Arrays.asList("1", "2", "3", "4");

        print(list1);
        print(list2);
        print(list3);
    }

    static void print(List<?> List) {
        List.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }
}
