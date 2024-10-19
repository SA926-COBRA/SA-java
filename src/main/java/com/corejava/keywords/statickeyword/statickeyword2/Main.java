package com.corejava.keywords.statickeyword.statickeyword2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Address permanentAddress = new Address(
                "42100",
                "Janakpur",
                "Nepal"
        );

        Address temporaryAddress = new Address(
                "234012",
                "Kathmandu",
                "Nepal"
        );

        Car ferrari = new Car(
                CarBrand.FERRARI,
                new BigDecimal("9100000")
        );
        Car tesla = new Car(
                CarBrand.TESLA,
                new BigDecimal("9100000")
        );

        Car[] cars = new Car[]{ferrari};
        Person sani = new Person(
                "Bibechana",
                19,
                new Address[]{permanentAddress, temporaryAddress},
                cars
        );

        Car[] cars1 = new Car[]{ferrari, tesla};

        Person gyanu = new Person(
                "Sani",
                19,
                new Address[]{permanentAddress},
                cars1
        );

        System.out.println(sani);
        System.out.println(gyanu);

        System.out.println(Person.count);
    }
}
