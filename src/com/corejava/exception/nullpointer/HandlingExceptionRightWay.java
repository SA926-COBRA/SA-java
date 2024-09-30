package com.corejava.exception.nullpointer;

import java.util.Objects;
import java.util.Optional;

public class HandlingExceptionRightWay {
    public static void main(String[] args) {
        String brand = "Krishna";
        Optional<String> brandOptional =
                Optional.ofNullable(brand);
        System.out.println(brandOptional.isEmpty());
        if (brandOptional.isEmpty()) {
            System.out.println("Brand is empty");
        } else {
            System.out.println(brandOptional.get());
        }
        brandOptional.
                ifPresentOrElse(
                        b -> System.out.println(b.toUpperCase()),
                        () -> System.out.println("Brand is empty"));
        var result = brandOptional.orElse("Krishna Foundation");
        System.out.println(result);

        printTnUpperCase(Optional.empty());
        printTnUpperCase(Optional.of("Gekko"));
    }

    public static void printTnUpperCase(Optional<String> input) {
        input.ifPresent(s -> System.out.println(s.toUpperCase()));
    }
}
