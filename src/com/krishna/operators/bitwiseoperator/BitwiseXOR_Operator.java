package com.krishna.operators.bitwiseoperator;

public class BitwiseXOR_Operator {
    public static void main(String[] args) {
        int a = 19;
        int b = 13;
        System.out.println("Value of a : " + a + "\nValue of b : " + b);

       /*
                It returns bit by bit XOR of input values, i.e.,
                if corresponding bits are different, it gives 1, else it shows 0.
       */

        System.out.println("Performing Bitwise XOR Operator ( ^ ) : " + (a ^ b));
    }
}
