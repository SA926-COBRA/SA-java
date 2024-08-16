package com.corejava.dateandtime.localtime;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime someTime = LocalTime.of(
                12,
                30,
                45,
                60
        );

        System.out.println(someTime);
    }
}