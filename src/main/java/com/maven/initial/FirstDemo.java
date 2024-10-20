package com.maven.initial;

import com.github.javafaker.Faker;

public class FirstDemo {
    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println(faker.name().fullName());
        System.out.println(faker.number().digits(10));
        System.out.println(faker.address().city());
    }
}
