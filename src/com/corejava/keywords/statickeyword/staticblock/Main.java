package com.corejava.keywords.statickeyword.staticblock;

public class Main {
    public static void main(String[] args) {

        Person naresh = new Person(
                "Naresh",
                32
        );

        System.out.println(naresh);

        Person anotherPerson = new Person("Krishna", 25);
        System.out.println(anotherPerson);
    }
}