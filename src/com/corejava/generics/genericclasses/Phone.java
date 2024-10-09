package com.corejava.generics.genericclasses;

public class Phone {
    private final String brand;

    public String getBrand() {
        return brand;
    }

    public Phone(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                '}';
    }


}
