package com.corejava.keywords.breakkeyword;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        for (int nums : numbers) {
            if (nums == 5) {
                break;
            } else
                System.out.println(nums);
        }
    }
}
