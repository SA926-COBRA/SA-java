package com.corejava.oop.polymorphism.example;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    private String name;
    private Vehicle[] vehicles;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Vehicle[] vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vehicles=" + Arrays.toString(vehicles) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.deepEquals(vehicles, person.vehicles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(vehicles));
    }
}
