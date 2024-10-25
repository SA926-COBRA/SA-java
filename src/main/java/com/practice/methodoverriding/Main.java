package com.practice.methodoverriding;

public class Main {
    public static void main(String[] args) {
        // Create an Instrument object
        Instrument generalInstrument = new Instrument();
        generalInstrument.play();

        // Create a Guitar object
        Instrument guitar = new Guitar(); // Polymorphic reference
        guitar.play();

        // Create a Piano object
        Instrument piano = new Piano(); // Polymorphic reference
        piano.play();
    }
}