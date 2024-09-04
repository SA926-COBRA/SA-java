package com.corejava.constructors.example2;

public class Main {
    public static void main(String[] args) {
        Cat gyanu = new Cat("Gyanu", 1, "White");
        Cat pitali = new Cat("Pitali", 2, "Black");

        Cat[] cats = {gyanu, pitali};
        Person nirmal = new Person(
                "Nirmal",
                "BK",
                Gender.MALE,
                cats);

        System.out.println(nirmal);
    }
}
