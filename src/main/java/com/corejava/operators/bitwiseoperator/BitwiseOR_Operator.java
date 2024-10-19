package com.corejava.operators.bitwiseoperator;

public class BitwiseOR_Operator {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println("Value of a : " + a + " \nValue of b : " + b);

        /*
                It returns bit by bit OR of input values, i.e.,
                if either of the bits is 1, it gives 1, else it shows 0.
        */
        System.out.println("Performing Bitwise OR operator (a | b) : " + (a | b));

        /*
            a = 5 = 0101 (In Binary)
            b = 7 = 0111 (In Binary)

            Bitwise OR Operation of 5 and 7
                  0101
                | 0111
                 ________
                  0111  = 7 (In decimal)
         */
    }
}
