package com.corejava.string;

public class Main {
    public static void main(String[] args) {
        String name = "Bibechana";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println("    ".isBlank());
        System.out.println("    ".isEmpty());
        System.out.println("Hello          ".trim());
        System.out.println(name.startsWith("B"));
        System.out.println(name.endsWith("a"));
        System.out.println(name.substring(2));
        System.out.println(name.substring(0, 4));
        System.out.println(name.replace("c", "s"));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.replaceAll("Bibechana", "Krishna"));
        System.out.println(name.intern());
        System.out.println(name.concat(" and Krishna"));
    }
}
