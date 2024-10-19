package com.corejava.variables.global;

public class AnotherClassToAccessGlobalVariable {
    public static void bhai() {
        System.out.println("\nHello From Bhai");
        System.out.println(Main.PI);
        //  NAME can't be accessed here because of the access modifier
        //  System.out.println(Main.NAME);
    }

}
