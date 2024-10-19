package com.corejava.dateandtime.localdatetime;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getYear());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.minusDays(366));

        // Working with days and time
        LocalDateTime daysAndTime = LocalDateTime.of(
                2003,
                Month.AUGUST,
                19,
                14,
                55,
                23
        );

        System.out.println(daysAndTime);
    }
}
