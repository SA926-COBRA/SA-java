package com.projects.carbooking.car;

public class CarService {
    private Car[] cars = new Car[100];
    private int carCount = 0;

    public void addCar(String regNum, CarBrand carBrand, boolean isElectric) {
        Car car = new Car(regNum, carBrand, isElectric);
        cars[carCount] = car;
        carCount++;
    }

    public Car[] getAvailableCars() {
        return cars;
    }

    public Car[] getAvailableElectricCars() {
        int electricCarCount = 0;

        // First, count how many electric cars are there
        for (int i = 0; i < carCount; i++) {
            if (cars[i].isElectric()) {
                electricCarCount++;
            }
        }

        // Creating new array to hold electric cars only
        Car[] electricCars = new Car[electricCarCount];
        int electricCarIndex = 0;

        // Populate the new array with electric cars
        for (int i = 0; i < carCount; i++) {
            if (cars[i].isElectric()) {
                electricCars[electricCarIndex] = cars[i];
                electricCarIndex++;
            }
        }
        return electricCars;
    }

    public boolean bookCar(String regNum) {
        for (int i = 0; i < carCount; i++) {
            Car car = cars[i];
            if (car.getRegNumber().equals(regNum)) {
                if (car.isAvailable()) {
                    car.setAvailable(false);
                    System.out.println("Car with registration number " + regNum + " has been successfully booked.");
                    return true;
                } else {
                    System.out.println("Car with registration number " + regNum + " is already booked.");
                    return false;
                }
            }
        }
        System.out.println("Car with registration number " + regNum + " is not found.");
        return false;
    }
}