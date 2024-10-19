package com.corejava.operators.assignmentoperator.compoundassignmentoperator;

public class DivideAndAssignmentOperator {
    public static void main(String[] args) {

        int a = 100;
        System.out.println("Value of a before performing the operator (/=) : " + a);

        a /= 20;    // a = a  /20;
        System.out.println("Value of a after performing the operator (/=) : " + a);
    }
}
