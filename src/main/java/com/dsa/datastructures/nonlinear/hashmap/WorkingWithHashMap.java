package com.dsa.datastructures.nonlinear.hashmap;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithHashMap {
    public static void main(String[] args) {
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Jamila"), new Diamond("African Diamond"));

        System.out.println(new Person("Jamila").hashCode());
        System.out.println(new Person("Jamila").hashCode());
        System.out.println(map.get(new Person("Jamila")));
    }

    private static void maps() {
        HashMap<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Harry"));
        map.put(2, new Person("Luke"));
        map.put(3, new Person("Jack"));
        map.put(4, new Person("Kailash"));
        map.put(4, new Person("Khagendra"));

        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.containsKey(4));
        map.remove(3);
        System.out.println(map.entrySet());


        map.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
        map.entrySet().forEach(System.out::println);

        System.out.println(map.getOrDefault(3, new Person("Default")));
        System.out.println(map.values());
        map.values().forEach(System.out::println);
    }

    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(name);
        }
    }

    record Diamond(String name) {
    }
}
