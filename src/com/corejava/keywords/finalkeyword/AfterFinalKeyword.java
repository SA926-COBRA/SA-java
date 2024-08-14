package com.corejava.keywords.finalkeyword;

public class AfterFinalKeyword {
    public static void main(String[] args) {
        // This is how we can make constant variable in local variable, but not recommended.
        final var name = "Krishna";
        // name = "Riyanshi";
        System.out.println(name);
    }
}
