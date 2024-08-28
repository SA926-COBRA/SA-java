package com.corejava.constructors.tostring;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FamilyMembers newFamily1 = new FamilyMembers("Krishna", 21, "Male");

        // Print the name of the family member
        System.out.println(newFamily1.getName());

        // Print the age of the family member
        System.out.println(newFamily1.getAge());

        // Print the gender of the family member
        System.out.println(newFamily1.getGender());

        // Print the string representation of the family member using toString method
        System.out.println(newFamily1.toString());

        // Print the family member object, which implicitly calls toString
        System.out.println(newFamily1);

        String[] names = {"Riyanshi", "Sangita", "Pabitra", "Janaki"};
        System.out.println(Arrays.toString(names));
    }
}