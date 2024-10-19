package com.corejava.datatypes.nonprimitive;

public class PassByValue {
    public static void main(String[] args) {
        int age = 21;
        int ageCopy = age;

        System.out.println("age = " + age);
        System.out.println("ageCopy = " + ageCopy);

        System.out.println("Age after increment : " + (increment(age)));
    }

    static int increment(int age) {
        return ++age;
    }
}
