package com.corejava.bestpractice.person;

public class PersonService {
    public int addPerson(Person person) {
        if (person.getName().isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }
        // Store person to Database
        return 1;
    }
}
