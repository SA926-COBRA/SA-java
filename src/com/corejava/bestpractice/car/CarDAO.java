package com.corejava.bestpractice.car;

public class CarDAO {
    private static Car[] cars;
    private static int nextAvailableSlot = 0;

    private static final int CAPACITY = 6;

    static {
        cars = new Car[CAPACITY];
    }

    public void saveCar(Car car) {
        if (nextAvailableSlot + 1 >= CAPACITY) {
            // Grow DB
        }
        cars[nextAvailableSlot] = car;
        nextAvailableSlot++;
    }

    public Car[] selectAllCars() {
        return cars;
    }
}

