package com.corejava.operators.bitwiseoperator;

public class BitwiseComplementOperator {
    public static void main(String[] args) {
        int b = 11;
        System.out.println("Value of B before performing the operatino: " + b);

        /*
                It returns the one’s complement representation of the input value, i.e.,
                with all bits inverted, which means it makes every 0 to 1, and every 1 to 0.
         */

        System.out.println("Performing Bitwise Complement Operator (~) B =  " + ~ b);
    }
}
