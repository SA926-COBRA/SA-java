package com.corejava.constructors.generatingwithide;

public class Main {
    public static void main(String[] args) {
        Students students = new Students();
        System.out.println(students.getName());

        Students students2 = new Students("Krishna");
        System.out.println(students2.getName());

        Students students3 = new Students("Krishna", 12, "Nepal");
        System.out.println(students3.getName());
        System.out.println(students3.getRoll());
        System.out.println(students3.getAddress());

        System.out.println(students3.getClass());
    }
}
