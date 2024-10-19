package com.corejava.bean;

import java.io.Serializable;
import java.math.BigDecimal;

// A class should implement Serializable, all properties should be private, should have a default constructor and getters and setters to access private properties

public class Car implements Serializable {
    private String regNumber;
    private BigDecimal price;

    public Car() {
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
}
