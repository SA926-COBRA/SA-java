package com.practice.methodoverriding;

// Subclass Guitar that overrides the play method
class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("The guitar strums: Strum strum!");
    }
}