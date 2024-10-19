package com.corejava.datatypes.nonprimitive;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // Arrays
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 5;
        nums[3] = 7;
        nums[4] = 9;

        // Printing the initial value
        System.out.println("Elements initially stored on Array (nums) = " + Arrays.toString(nums));
        System.out.println("Number of elements stored on Array (nums) = " + nums.length);

        // Changing the value of 4th index
        nums[4] = 14;
        System.out.println("After changing the value of 4th index, Array Elements = " + Arrays.toString(nums));
        System.out.println();

        // Declaring another array (nums2) with different approach
        int[] nums2 = {1, 2, 3, 4, 5};

        // Printing size and elements stored on the array
        System.out.println("Size of the array (nums2) = " + nums2.length);
        System.out.println("Elements initially stored on Array (nums2) = " + Arrays.toString(nums2));

        // Changing the value of 2nd index
        nums2[2] = 55;
        System.out.println("After changing the value of 2nd index, Array Elements = " + Arrays.toString(nums2));
        System.out.println();

        // Declaring and printing String data-type array
        String[] names = {"Krishna", "Khagendra", "Bibechana", "Sangita"};
        System.out.println("Names initially stored on array (names) = " + Arrays.toString(names));

        // Changing the value of array index
        names[2] = "Gyanu";
        names[3] = "Riyanshi";
        System.out.println("After changing the value of 2nd and 3rd index, Names = " + Arrays.toString(names));

    }
}
