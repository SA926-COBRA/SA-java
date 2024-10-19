package com.corejava.variables.global;

import static com.corejava.variables.global.AnotherClassToAccessGlobalVariable.bhai;

public class Main {

    private static final String NAME = "Krishna";
    public static final double PI = 3.1415;

    public static void main(String[] args) {
        System.out.println(NAME);
        System.out.println(PI);

        dai();
        bhai();
    }

    // Another Function
    private static void dai() {
        System.out.println(NAME);
        System.out.println(PI);
    }
}
