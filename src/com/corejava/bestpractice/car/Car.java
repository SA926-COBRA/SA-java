package com.corejava.bestpractice.car;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {
    private String regNumber;
    private BigDecimal price;

    public Car() {
    }

    public Car(String regNumber, BigDecimal price) {
        this.regNumber = regNumber;
        this.price = price;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(regNumber, car.regNumber) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, price);
    }

    @Override
    public String toString() {
        return "Car{" + "regNumber='" + regNumber + '\'' + ", price=" + price + '}';
    }
}
