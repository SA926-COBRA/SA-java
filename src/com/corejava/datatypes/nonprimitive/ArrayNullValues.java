package com.corejava.datatypes.nonprimitive;

import java.util.*;

public class ArrayNullValues {
    public static void main(String[] args) {
        // Primitive Data type in array with null values
        int[] nums = new int[10];
        nums[3] = 12;
        System.out.println("Elements stored in integer array with default null values : " + Arrays.toString(nums));

        // Changing the default null values for primitive data type which is "0"
        Arrays.fill(nums, -1);
        nums[5] = 12;
        System.out.println("Elements stored in integer array with modified null values : " + Arrays.toString(nums));

        // Reference data type with null values
        String[] names = new String[10];
        names[4] = "Cat";
        System.out.println("\nElements stored in String array with default null values : " + Arrays.toString(names));

        // Changing the default null value for reference data type which is "null"
        Arrays.fill(names, "Meow");
        names[8] = "Cat";
        System.out.println("Elements stored in String array with modified null values : " + Arrays.toString(names));
    }
}
