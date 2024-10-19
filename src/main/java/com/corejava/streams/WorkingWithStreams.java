package com.corejava.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WorkingWithStreams {

    @Test
    void streams() {
        List<String> names = List.of("Krishna", "Harry", "Ram");
        Stream<String> stream = names.stream();

        Stream<String> namesStream = Stream.of("Krishna", "Harry", "Ram");

        long count = stream.limit(2).map(null).sorted(null).dropWhile(null).count();

        String[] namesArray = {};

        Arrays.stream(namesArray);
    }
}