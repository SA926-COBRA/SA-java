package com.practice.exercise;

import java.util.Objects;

public class Address {
    private String firstLine;
    private String postalCode;
    private String country;

    public Address(String firstLine, String postalCode, String country) {
        this.firstLine = firstLine;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(firstLine, address.firstLine) && Objects.equals(postalCode, address.postalCode) && Objects.equals(country, address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstLine, postalCode, country);
    }

    @Override
    public String toString() {
        return "Address{" +
                "firstLine='" + firstLine + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
