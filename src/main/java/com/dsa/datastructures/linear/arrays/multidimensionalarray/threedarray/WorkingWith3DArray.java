package com.dsa.datastructures.linear.arrays.multidimensionalarray.threedarray;

public class WorkingWith3DArray {
    public static void main(String[] args) {
        // Declare a 3D array with dimensions 2x3x4
        int[][][] array = {
                {
                        {1, 2, 3, 4}, // First 2D array (first layer)
                        {5, 6, 7, 8},
                        {9, 10, 11, 12}
                },
                {
                        {13, 14, 15, 16}, // Second 2D array (second layer)
                        {17, 18, 19, 20},
                        {21, 22, 23, 24},
                }
        };

        // Accessing an element
        System.out.println("Element at array[1][2][3]: " + array[1][2][3]); // Output: 24

        // Loop through the 3D array and print all elements
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.println(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();   // Print an empty line to separate the layers
        }
    }
}
