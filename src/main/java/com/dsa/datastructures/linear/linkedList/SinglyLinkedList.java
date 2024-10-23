package com.dsa.datastructures.linear.linkedList;

public class SinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Add nodes to the linked list
        list.append(12);
        list.append(13);
        list.append(14);

        // Print the linked list
        list.printList();
    }

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a new node at the end of the list
    public void append(int newData) {
        Node newNode = new Node(newData);

        // If the Linked list is empty, make the new node the head.
        if (head == null) {
            head = newNode;
            return;
        }

        // Else, traverse to the end and add the new node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Method to print linked list
    public void printList() {
        Node currenetNode = head;
        while (currenetNode != null) {
            System.out.print(currenetNode.data + " ");
            currenetNode = currenetNode.next;
        }
    }
}
