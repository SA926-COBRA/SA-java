package com.corejava.generics.typeerasure;

public class TypeErasure {

    // Generic Node class using type parameter <T>
    public class GenericNode<T> {

        private T data;
        private GenericNode<T> next;

        public GenericNode(T data, GenericNode<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }
    }

    // Node class using Object (without generics)
    public class ObjectNode {

        private Object data;
        private ObjectNode next;

        public ObjectNode(Object data, ObjectNode next) {
            this.data = data;
            this.next = next;
        }

        public Object getData() {
            return data;
        }
    }

    // Generic Node class with bounded type parameter <T extends Comparable<T>>
    public class BoundedNode<T extends Comparable<T>> {

        private T data;
        private BoundedNode<T> next;

        public BoundedNode(T data, BoundedNode<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }
    }

    // Node class using Comparable (without generics)
    public class ComparableNode {

        private Comparable data;
        private ComparableNode next;

        public ComparableNode(Comparable data, ComparableNode next) {
            this.data = data;
            this.next = next;
        }

        public Comparable getData() {
            return data;
        }
    }
}
