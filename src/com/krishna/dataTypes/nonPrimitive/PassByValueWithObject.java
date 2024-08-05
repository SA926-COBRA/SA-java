package com.krishna.dataTypes.nonPrimitive;

import java.awt.*;

public class PassByValueWithObject {
    public static void main(String[] args) {
        Point pointA = new Point(1, 4);
        Point pointB = pointA;

        pointA.x = 100;
        pointA.y = 200;

        System.out.println("pointA = " + pointA);
        System.out.println("pointB = " + pointB);

        pointB = new Point(150, 230);
        System.out.println("pointA = " + pointA);
        System.out.println("pointB = " + pointB);
    }
}
