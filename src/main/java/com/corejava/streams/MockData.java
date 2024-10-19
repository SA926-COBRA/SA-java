package com.corejava.streams;

import java.util.Arrays;
import java.util.List;

public class MockData {
    public static List<Person> getpeople() {
        return Arrays.asList(
                new Person("John", 16),
                new Person("Anna", 17),
                new Person("Mike", 19),
                new Person("Chris", 18),
                new Person("Lucy", 15),
                // Add more mock people
                new Person("Sophia", 22),
                new Person("Jacob", 14),
                new Person("Olivia", 17),
                new Person("Ram", 12)
        );
    }
}
