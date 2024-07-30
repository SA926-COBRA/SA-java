package com.krishna.operators.arithmeticOperator;

import java.util.Scanner;

public class Modulus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dividend : ");
        int dividend = sc.nextInt();

        System.out.println("Enter the divisor : ");
        int divisor = sc.nextInt();
        sc.close();

        int remainder = dividend % divisor;
        System.out.println("The remainder is : "+remainder);

    }
}
