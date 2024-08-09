package com.krishna.controlstatements.loop.forloop;

public class ForLoop {
    public static void main(String[] args) {

        System.out.println("Start of for loop");
        for (int i = 0; i <= 10; i++) { //i++ : i += 1 -> i = i +1;
            System.out.println(i + " Meow");
        }
        System.out.println("End of for loop");

        System.out.println("\nStart of reverse for loop");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i + " Meow");
        }
        System.out.println("End of reverse for loop");

        System.out.println("\nStart of for loop to increment by 4");
        for (int i = 0; i <= 20; i += 4) {
            System.out.println(i + " Meow");
        }
        System.out.println("End of for loop to increment by 4");
    }
}
