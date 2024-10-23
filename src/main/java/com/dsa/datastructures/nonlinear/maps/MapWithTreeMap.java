package com.dsa.datastructures.nonlinear.maps;

import java.util.TreeMap;
import java.util.Map;

public class MapWithTreeMap {
    public static void main(String[] args) {
        // Create a TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        treeMap.put(3, "Cherry");
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");

        // Print the map in sorted order (based on keys)
        System.out.println("TreeMap: " + treeMap);
    }
}