package com.corejava.bestpractice.garage;

import com.corejava.bestpractice.car.Car;

public class GarageService {
    public boolean addCarToGarage(Car car, Garage garage) {
        if (car == null) {
            throw new IllegalArgumentException("car cannot be null");
        }

        int count = 0;
        for (Car c : garage.getCars()) {
            if (c != null) {
                count++;
            }
        }
        if (count >= garage.getCapacity()) {
            return false;
        }

        // Add car to garage.
        return true;
    }
}
