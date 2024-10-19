package com.corejava.accessmodifiers.publicaccessmodifier;

public class AccessingPublicAccessModifier {
    public static void main(String[] args) {
        System.out.println("Printing the value of goo from PublicAccessModifier : " + PublicAccessModifier.goo);

        // Accessing hello class from PublicAccessModifier
        System.out.println("Sum of two integers : " + PublicAccessModifier.hello(10, 20));
    }
}
