package com.corejava.string.staticmethods;

public class Main {
    public static void main(String[] args) {
        var num1 = 1;
        String number = String.valueOf(num1);
        String number2 = String.valueOf(3);

        System.out.println("The String Value = " + number);
        System.out.println("The String Value = " + number2);

        String format = String.format("The String Value : %s", number);
        System.out.println(format);

        String name[] = {"Paru", "Bhim", "Parwati", "Naresh", "Sangita", "Radha", "Riyanshi", "Bibechana", "Krishna"};
        String join = String.join(", ", name);
        System.out.println(join);
    }
}