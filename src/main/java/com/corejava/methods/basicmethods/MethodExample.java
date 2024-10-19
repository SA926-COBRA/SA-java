package com.corejava.methods.basicmethods;

public class MethodExample {
    /*
        To be a method, it should have :
        - Access Modifier
        - 'static' keyword (Optional)
        - Return Type ( void, int, String, double etc.)
        - Name (Method Name such as 'main')
        - Parameters such as inta, int b (Optional)
        - Method Body
        - Return Value (Optional)

        syntax:
        public static int display(){
            // Body
            // Return Value
        }
     */

    // method with return type
    private static int addValue(int a, int b) {
        int add = a + b;
        return add;
    }

    // method without return type
    private void brandName(String name) {
        System.out.println(name.toUpperCase());
    }

    // another method
    private static void isAdult(int age) {
        if (age >= 18) {
            System.out.println("Adult :)");
        } else
            System.out.println("Not adult :( ");
    }

    public static void main(String[] args) {
        // Invoking method with arguments
        int sum = addValue(10, 10);

        // Printing the value
        System.out.println("Sum = " + sum);

        // Invoking method with arguments and printing the value at the same time
        System.out.println("Sum = " + addValue(20, 40));

        // Non-static method can not be accessed within the static method without creating objects
        MethodExample me = new MethodExample();
        me.brandName("WatchlistNepal");

        isAdult(19);
        isAdult(14);
    }
}
