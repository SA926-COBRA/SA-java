package com.corejava.bestpractice.person;

import com.corejava.bestpractice.car.Car;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String address;
    private Car[] cars;

    public Person() {
    }

    public Person(String name, int age, String address, Car[] cars) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(address, person.address) && Objects.deepEquals(cars, person.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address, Arrays.hashCode(cars));
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}
