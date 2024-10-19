package com.projects.carbooking.car;

import java.math.BigDecimal;

public class CarDAO {

    private static final Car[] CARS = {
            new Car("1234", new BigDecimal("89.00"), Brand.TESLA, true),
            new Car("5678", new BigDecimal("50.00"), Brand.AUDi, false),
            new Car("5678", new BigDecimal("77.00"), Brand.MERCEDES, false),
    };

    public Car[] getAllCars() {
        return CARS;
    }
}
