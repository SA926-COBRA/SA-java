package com.practice.exercise2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Address address = new Address(
                "Sanothimi",
                "72100",
                "Kathmandu",
                "Nepal"
        );

        Car bugatti = new Car(
                CarBrand.BUGATTI,
                new BigDecimal("750000")
        );

        Car royce = new Car(
                CarBrand.ROLLSROYCE,
                new BigDecimal("500000")
        );

        Car[] cars = new Car[]{bugatti, royce};

        Contact ntc = new Contact(
                "Nepal Telecom",
                "+977 9842000000"
        );

        Contact ncell = new Contact(
                "Ncell",
                "+977 9810000000"
        );

        Contact[] contacts = new Contact[]{ntc, ncell};

        Person krishna = new Person(
                "Krishna",
                20,
                address,
                cars,
                contacts
        );

        System.out.println(krishna);
    }
}
