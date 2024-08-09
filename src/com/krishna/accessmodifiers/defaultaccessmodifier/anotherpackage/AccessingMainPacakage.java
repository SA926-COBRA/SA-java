package com.krishna.accessmodifiers.defaultaccessmodifier.anotherpackage;

import com.krishna.accessmodifiers.defaultaccessmodifier.samepackage.Main;

public class AccessingMainPacakage {
    public static void main(String[] args) {
    // Trying to access String name = "Nirmal" from this package

        // can't be accessible as it is default access modifier which only allows to be accessible within the same package
//        System.out.println("Name : " + Main.name);
    }
}
