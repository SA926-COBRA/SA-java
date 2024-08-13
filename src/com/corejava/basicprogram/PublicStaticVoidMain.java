package com.corejava.basicprogram;

import java.util.Arrays;

public class PublicStaticVoidMain {
    public static void main(String[] args) {
        System.out.println("Program was given ");
        if (args.length > 0) {
            System.out.println("The following arguments: ");
            System.out.println(Arrays.toString(args));
        } else
            System.out.println("No arguments given");
    }
}