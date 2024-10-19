package com.corejava.exception.nullpointer;

import java.util.Objects;

public class HandlingException {
    public static void main(String[] args) {
        // The wrong way of handling Null Pointer Exception
        // 1. Try-Catch
        String brand = null;
        try {
            System.out.println(brand.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("brand is null");
        }

        // 2. If-Else
        String myBrand = "Gyanu";
        if (myBrand == null) {
            System.out.println("myBrand is null");
        } else {
            System.out.println(myBrand.toUpperCase());
        }

        // 3. Object
        String brandName = null;
        printTnUpperCase(brandName);
    }

    public static void printTnUpperCase(String input) {
        Objects.requireNonNull(input, "Input cannot be null.");
        System.out.println(input.toUpperCase());
    }
}
