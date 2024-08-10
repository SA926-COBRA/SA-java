package com.corejava.operators.unaryoperator;

public class BitwiseComplement {
    public static void main(String[] args) {
        int a = 5;
        int b = -2;

        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);

        //Performing bitwise complement
        System.out.println(a + "'s bitwise complement is " + ~a);
        System.out.println(b + "'s bitwise complement is " + ~b);

        // This unary operator returns the one’s complement representation of the input value or operand,
        // i.e, with all bits inverted, which means it makes every 0 to 1, and every 1 to 0.

        /* Illustration:

            a = 5 [0101 in Binary]
            result = ~5
            This performs a bitwise complement of 5
            ~0101 = 1010 = 10 (in decimal)
            Then the compiler will give 2’s complement
            of that number.
            2’s complement of 10 will be -6.
            result = -6
         */
    }
}
