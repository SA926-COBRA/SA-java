package com.corejava.dateandtime.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class WorkingWIthZoneId {
    public static void main(String[] args) {

        // to get all the available zones
        for (String zone : ZoneId.getAvailableZoneIds()) {
            System.out.println(zone);
        }

        LocalDateTime nowHere = LocalDateTime.now();
        LocalDateTime nowInSydney = LocalDateTime.now(ZoneId.of("Australia/Sydney"));

        System.out.println("Current Date and time here : " + nowHere);
        System.out.println("Current Date and time in Australia/Sydney : " + nowInSydney);

    }
}
