package com.practice.exercise2;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private Address address;
    private Car[] cars;
    private Contact[] contacts;


    public Person(String name, int age, Address address, Car[] cars, Contact[] contacts) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.cars = cars;
        this.contacts = contacts;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(address, person.address) && Objects.deepEquals(cars, person.cars) && Objects.deepEquals(contacts, person.contacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address, Arrays.hashCode(cars), Arrays.hashCode(contacts));
    }

    @Override
    public String
    toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", cars=" + Arrays.toString(cars) +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }
}
