package com.corejava.exception.unchecked;

public class CatchAllExceptions {
    public static void main(String[] args) {

        try {
            int num = Integer.parseInt("12");
            System.out.println(num);

            for (int i = 10; i >= 0; i--) {
                System.out.println(10 / i);
            }
            System.out.println("End");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

