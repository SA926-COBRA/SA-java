package com.dsa.datastructures.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapWithLinkedHashMap {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        Map<Integer, String> linkedMap = new LinkedHashMap<>();

        // Add key-value pairs to the LinkedHashMap
        linkedMap.put(1, "Apple");
        linkedMap.put(2, "Banana");
        linkedMap.put(3, "Cherry");

        // Print the map in insertion order
        System.out.println("LinkedHashMap: " + linkedMap);
    }
}
