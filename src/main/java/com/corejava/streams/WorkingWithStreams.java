package com.corejava.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WorkingWithStreams {

    @Test
    void streams() {
        // Sample list of names
        List<String> names = List.of("Krishna", "Harry", "Ram");

        // Creating a stream from the list of names
        Stream<String> stream = names.stream();

        // Creating a stream using Stream.of
        Stream<String> namesStream = Stream.of("Krishna", "Harry", "Ram");

        // Count the first two names, map to uppercase, sort, and count
        long count = stream.limit(2)
                .map(String::toUpperCase)  // Convert to uppercase
                .sorted()                   // Sort the names
                .count();

        // Print the count
        System.out.println("Count of names: " + count);

        // Example array of names
        String[] namesArray = {"Krishna", "Harry", "Ram"};

        // Create a stream from the names array
        Arrays.stream(namesArray)
                .forEach(System.out::println); // Print each name in the array
    }
}
