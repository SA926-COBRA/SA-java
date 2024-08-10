package com.corejava.operators.assignmentoperator.compoundassignmentoperator;

public class ModulusAndAssignmentOperator {
    public static void main(String[] args) {

        int a = 103;
        System.out.println("Value of a before performing the operator (%=) : " + a);

        a %= 20;
        System.out.println("Value of a after performing the operator (%=) : " + a);
    }
}
