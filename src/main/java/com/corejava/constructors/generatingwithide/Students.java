package com.corejava.constructors.generatingwithide;

import java.util.Objects;

public class Students {
    private String name;
    private int roll;
    private String address;

    // In IntelliJ, we can use `alt + insert` button on Windows to generate the following,
    // such as Constructor, Getters and Setters and many more

    public Students(String name, int roll, String address) {
        this.name = name;
        this.roll = roll;
        this.address = address;
    }

    public Students(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public Students(String name) {
        this.name = name;
    }

    public Students() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return roll == students.roll && Objects.equals(name, students.name) && Objects.equals(address, students.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roll, address);
    }
}
