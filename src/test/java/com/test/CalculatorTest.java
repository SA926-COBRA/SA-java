package com.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void canAddTwoNumbers() {
        Calculator underTest = new Calculator();
        int number1 = 10;
        int number2 = 20;

        int result = underTest.add(number1, number2);

        assertEquals(result, 30);

    }


}
