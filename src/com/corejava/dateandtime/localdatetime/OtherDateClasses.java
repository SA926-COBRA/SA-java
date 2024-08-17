package com.corejava.dateandtime.localdatetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class OtherDateClasses {
    public static void main(String[] args) {

        // to get local date and time
        System.out.println(LocalDateTime.now());

        // to get local date and time with zone
        System.out.println(ZonedDateTime.now());

        // another method to get local date time using `Instant` keyword
        System.out.println(Instant.now());
    }
}