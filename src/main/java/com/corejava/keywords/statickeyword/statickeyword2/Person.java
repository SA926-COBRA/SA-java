package com.corejava.keywords.statickeyword.statickeyword2;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    public static int count = 0;

    private String name;
    private int age;
    Address[] addresses;
    private Car[] cars;

    public Person(String name, int age, Address[] addresses, Car[] cars) {
        this.name = name;
        this.age = age;
        this.addresses = addresses;
        this.cars = cars;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
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

    public Address[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
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
        return age == person.age && Objects.equals(name, person.name) && Objects.deepEquals(addresses, person.addresses) && Objects.deepEquals(cars, person.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, Arrays.hashCode(addresses), Arrays.hashCode(cars));
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addresses=" + Arrays.toString(addresses) +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}
