package com.practice.methodoverriding;

// Subclass Piano that overrides the play method
class Piano extends Instrument {
    @Override
    public void play() {
        System.out.println("The piano plays: Plink plonk!");
    }
}