package com.dsa.datastructures.linear.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithLinkedList {
    public static void main(String[] args) {
        LinkedList<Persons> linkedList = new LinkedList<>();
        linkedList.add(new Persons("Krishna", 21));
        linkedList.add(new Persons("Luke Belmar", 25));
        linkedList.addFirst(new Persons("Bibechana", 19));
        linkedList.add(2, new Persons("Naresh", 32));
        linkedList.addLast(new Persons("Riyanshi", 3));

        ListIterator<Persons> personsListIterator = linkedList.listIterator();
        while (personsListIterator.hasNext()) {
            System.out.println(personsListIterator.next());
        }

        System.out.println();

        while (personsListIterator.hasPrevious()) {
            System.out.println(personsListIterator.previous());
        }
    }

    private static void queues() {
        Queue<Persons> supermarketQueue = new LinkedList<>();
        supermarketQueue.add(new Persons("Alex", 12));
        supermarketQueue.add(new Persons("Bob", 15));
        supermarketQueue.add(new Persons("Carl", 18));
        supermarketQueue.add(new Persons("Dan", 19));

        System.out.println(supermarketQueue.size());
        System.out.println(supermarketQueue.peek());
        System.out.println(supermarketQueue.poll());
        System.out.println(supermarketQueue.size());
        System.out.println(supermarketQueue.peek());
    }

    static record Persons(String name, int age) {
    }
}
