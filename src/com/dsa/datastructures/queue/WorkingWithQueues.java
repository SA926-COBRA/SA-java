package com.dsa.datastructures.queue;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        Queue<Person> supermarketQueue = new LinkedList<>();
        supermarketQueue.add(new Person("Alex", 12));
        supermarketQueue.add(new Person("Bob", 15));
        supermarketQueue.add(new Person("Carl", 18));
        supermarketQueue.add(new Person("Dan", 19));

        System.out.println(supermarketQueue.size());
        System.out.println(supermarketQueue.peek());
        System.out.println(supermarketQueue.poll());
        System.out.println(supermarketQueue.size());
        System.out.println(supermarketQueue.peek());
    }

    static record Person(String name, int age) {
    }
}
