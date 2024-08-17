package com.corejava.classes.bigdecimal;

import java.math.BigDecimal;

public class ExploringBigDecimalMethods {
    public static void main(String[] args) {
        BigDecimal number = BigDecimal.TEN;
        System.out.println(number);
        System.out.println(number.add(BigDecimal.ONE));
        System.out.println(number.max(BigDecimal.ZERO));

        BigDecimal number2 = new BigDecimal("-2");
        System.out.println(number2.abs());  // to print absolute number

        System.out.println(number.compareTo(BigDecimal.TWO));
    }
}
