package com.corejava.solid;

import java.util.List;

public class AreaCalculator implements IAreaCalculator {
    @Override
    public int sum(List<Shape> shapes) {
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            sum += shapes.get(i).are();
        }
        return sum;
    }
}
