package com.practice.methodoverloading;

public class Dog {
    public void bark(){
        System.out.println("The dog is barking");
    }

    public void bark(int times){
        for (int i = 0; i < times; i++){
            System.out.println("Woof!);");
        }
    }

    public void bark(String sound){
        System.out.println("The dog says: " + sound);
    }
}
