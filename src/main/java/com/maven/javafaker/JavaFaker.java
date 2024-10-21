package com.maven.javafaker;

import com.github.javafaker.Faker;

public class JavaFaker {
    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println(faker.name().fullName());
        System.out.println(faker.number().digits(10));
        System.out.println(faker.address().city());
    }
}
