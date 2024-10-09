package com.corejava.generics;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericType {
    public static void main(String[] args) {
//      List<E>
        List<String> names = new ArrayList<String>();
        List<Integer> numbers = new ArrayList<Integer>();

//      Map<K, V>
        Map<String, String> map = new HashMap<>();
        Map<Point, Double> map2 = new HashMap<>();

        /*
            Naming Convention
            E - Element (Used extensively by the Java)
            K - Key (Used in Map)
            N - Number
            T - Type
            V - Value
         */
    }
}
