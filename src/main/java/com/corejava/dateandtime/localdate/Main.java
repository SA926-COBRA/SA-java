package com.corejava.dateandtime.localdate;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getYear());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.minusDays(366));

        // Working with days
        LocalDate someDate = LocalDate.of(
                2003,
                Month.AUGUST,
                19
        );

        System.out.println(someDate);
    }
}
