package com.krishna.dataTypes.nonPrimitive;

import java.awt.*;

public class ReferenceType {
    public static void main(String[] args) {

        // To store Simple Value
        int a = 20;

        // Reference Types / Objects
        Point pointA = new Point(10, 20);       // pointA is object here
        System.out.println("pointA = " + pointA);
        pointA.move(10, 21);
        System.out.println("pointA = " + pointA);

    }
}
