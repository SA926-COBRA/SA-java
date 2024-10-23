package com.dsa.datastructures.nonlinear.maps;

import java.util.HashMap;
import java.util.Map;

public class WorkingWIthMaps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Krishna"));
        map.put(2, new Person("Alex"));
        map.put(3, new Person("Mary"));
        map.put(4, new Person("Jack"));
        map.put(4, new Person("Jack"));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(2));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.remove(3);


        map.entrySet().forEach(System.out::println);
        map.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

        System.out.println(map.getOrDefault(3, new Person("Default")));
        System.out.println(map.values());
        map.values().forEach(System.out::println);
    }

    record Person(String name) {

    }
}
