package com.corejava.classes.bigdecimal;

import java.math.BigDecimal;

public class SolutionToDouble {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.02");
        BigDecimal b = new BigDecimal("0.03");

        BigDecimal result = b.subtract(a);
        System.out.println("Result: " + result);
    }
}
