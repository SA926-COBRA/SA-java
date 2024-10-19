package com.corejava.bestpractice.person;

import static com.corejava.bestpractice.utils.StringUtils.isEmpty;

public class PersonService {
    public int addPerson(Person person) {
        if (isEmpty(person.getName())) {
            throw new IllegalArgumentException("Name cannot be blank");
        }
        // Store person to Database
        return 1;
    }
}
