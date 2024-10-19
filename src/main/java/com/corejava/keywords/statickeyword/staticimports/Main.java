package com.corejava.keywords.statickeyword.staticimports;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        // System.out.println(Math.max(10, 20));
        // System.out.println(Math.min(20, 40));

        System.out.println("Maximum value: " + max(20, 40));
        System.out.println("Minimum value: " + min(20, 40));

    }
}
