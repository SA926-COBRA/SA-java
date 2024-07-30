package com.krishna.operators.unaryOperator;

public class    NotOperator {
    public static void main(String[] args) {
        boolean condition = true;
        int a = 20, b = 10;

        //Displaying values as it is
        System.out.println("Condition : " + condition);
        System.out.println("A : " + a);
        System.out.println("B : " + b);

        // Displaying values after applying Not Operator (!)
        System.out.println("!Condition : " + !condition);
        System.out.println("!(a<b) : " + !(a<b));
        System.out.println("!(a>b) : " + !(a>b));


        //This is used to convert true to false or vice versa. Basically, it reverses the logical state of an operand.
    }
}
