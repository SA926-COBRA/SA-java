package com.krishna.operators.shiftoperator;

public class AllShiftOperator {
    public static void main(String[] args) {

        int a = 5;
        int b = -20;

        // Left shift
        int leftShift = a << 2;
        System.out.println("5 << 2 = " + leftShift); // Output: 20

        // Right shift
        int rightShift = a >> 2;
        System.out.println("5 >> 2 = " + rightShift); // Output: 1

        // Right shift with negative number
        int rightShiftNegative = b >> 2;
        System.out.println("-20 >> 2 = " + rightShiftNegative); // Output: -5

        // Unsigned right shift
        int unsignedRightShift = b >>> 2;
        System.out.println("-20 >>> 2 = " + unsignedRightShift); // Output: 1073741819
    }
}
