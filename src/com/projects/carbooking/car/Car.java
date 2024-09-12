package com.projects.carbooking.car;

import java.util.Objects;

public class Car {
    private String regNumber;       // Unique for each car
    private CarBrand carBrand;
    private boolean isElectric;
    private boolean isAvailable;

    public Car() {
    }

    // Constructor with all fields
    public Car(String regNumber, CarBrand carBrand, boolean isElectric, boolean isAvailable) {
        this.regNumber = regNumber;
        this.carBrand = carBrand;
        this.isElectric = isElectric;
        this.isAvailable = isAvailable;
    }

    // Constructor without availability (can be set separately)
    public Car(String regNumber, CarBrand carBrand, boolean isElectric) {
        this.regNumber = regNumber;
        this.carBrand = carBrand;
        this.isElectric = isElectric;
        this.isAvailable = true;  // Default to available
    }

    // Getters and Setters
    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return isElectric == car.isElectric &&
                isAvailable == car.isAvailable &&
                Objects.equals(regNumber, car.regNumber) &&
                carBrand == car.carBrand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, carBrand, isElectric, isAvailable);
    }

    // ToString
    @Override
    public String toString() {
        return "Car{" +
                "regNumber='" + regNumber + '\'' +
                ", carBrand=" + carBrand +
                ", isElectric=" + isElectric +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
