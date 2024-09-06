package com.corejava.keywords.statickeyword2;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {
    private CarBrand car;
    private BigDecimal price;


    public Car(CarBrand car, BigDecimal price) {
        this.car = car;
        this.price = price;
    }

    public CarBrand getCar() {
        return car;
    }

    public void setCar(CarBrand car) {
        this.car = car;
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
        Car car1 = (Car) o;
        return car == car1.car && Objects.equals(price, car1.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "car=" + car +
                ", price=" + price +
                '}';
    }
}
