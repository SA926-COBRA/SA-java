package com.corejava.bestpractice;

import com.corejava.bestpractice.car.Car;
import com.corejava.bestpractice.car.CarService;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //  Best Practice to build projects:
        //  1. Packages -> managing projects in proper package
        //  2. Domain / Model  -> Simple Classes used to store data such as Car, Cat, Garage
        //  3. Service Classes -> Classes that contains Business Logic such as PersonService, GarageService
        //  4. Data Access Object (DAO) -> Responsible for adding to the database

        carExample();

        // 4. Utility Classes
        // 5. Configuration Classes

    }

    private static void carExample() {
        Car car = new Car(
                "124209",
                new BigDecimal("12301423")
        );

        CarService carService = new CarService();
        carService.registerNewCar(car);

        System.out.println(Arrays.toString(carService.getCars()));
    }
}
