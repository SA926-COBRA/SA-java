package com.practice.methodoverloading;

class Cat {
    public void meow() {
        System.out.println("The cat is meowing!");
    }

    public void meow(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Meow!");
        }
    }

    public void meow(String sound) {
        System.out.println("The cat says: " + sound);
    }
}