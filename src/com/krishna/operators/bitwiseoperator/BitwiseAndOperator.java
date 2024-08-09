package com.krishna.operators.bitwiseoperator;

public class BitwiseAndOperator {
    public static void main(String[] args) {
        int a = 13;
        int b = 12;
        System.out.println("Value of a : " + a + "\nValue of b : " + b);

       /*
                Value of a and b will be changed into binary and performed the Bitwise AND Operation
                It returns bit by bit AND of input values, i.e., if both bits are 1, it gives 1, else it shows 0.
        */
        System.out.println("Performing Bitwise AND Operator (a & b) : " + (a & b));
    }
}
