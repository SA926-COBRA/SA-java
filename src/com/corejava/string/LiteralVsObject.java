package com.corejava.string;

public class LiteralVsObject {
    public static void main(String[] args) {
        // String Literal
        String name1 = "Gyanu";
        String name2 = "Gyanu";

        // String Object
        String name3 = new String("Gyanu");

        // Comparing same and different value to see the output
        System.out.println(1 == 1);
        System.out.println(1 == 2);

        // Now comparing both String Literal and String Object
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
    }
}
