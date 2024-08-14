package com.corejava.keywords.enums;

public class Main {
    public static void main(String[] args) {
        System.out.println(WeekDays.SUNDAY);
        System.out.println(WeekDays.MONDAY);

        System.out.println(Colours.BLACK);
        System.out.println(Colours.RED);


        WeekDays today = WeekDays.SUNDAY;
        switch (today){
            case SUNDAY:
                System.out.println("Start of the week");
                break;
            case FRIDAY:
                System.out.println("End of the work week.");
                break;
            case SATURDAY:
                System.out.println("Time to relax");
                break;
            default:
                System.out.println("Midweek Days");
        }

    }
}
