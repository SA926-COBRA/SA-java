package com.corejava.exception.nullpointer;

public class Main {
    public static void main(String[] args) {
        String brand = "Krishna";
        System.out.println(brand.toUpperCase());

        Cat rosie = new Cat(null);
        System.out.println(rosie.toString());

//        rosie = null;
        System.out.println(rosie.getName().toString());
    }

    static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
