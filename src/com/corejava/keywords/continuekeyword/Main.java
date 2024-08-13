package com.corejava.keywords.continuekeyword;

public class Main {
    public static void main(String[] args) {
        var names = new String[]{
                "John",
                "Jane",
                "Purni",
                "Jack",
                "Jack"
        };

        for (String name : names) {
            if (name.startsWith("J")) {
                continue;
            }
            System.out.println(name);
        }
    }
}
