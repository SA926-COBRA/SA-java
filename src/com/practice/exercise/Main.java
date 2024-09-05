package com.practice.exercise;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Address address = new Address(
                "Sanothimi, Bhaktapur",
                "4700",
                "Nepal"
        );

        Car royce = new Car(
                CarBrand.ROLLSROYCE,
                new BigDecimal("450000")
        );

        Car[] cars = new Car[]{royce};

        Person alex = new Person(
                "Alex",
                12,
                address,
                cars
        );

        System.out.println(alex);
    }
}
