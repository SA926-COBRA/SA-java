package com.corejava.constructors.usingmultiple;

public class Baby {
    private String gender;
    private String name;
    private int age;

    // Default Constructor
    public Baby() {
        // Initialize default values if necessary
        this.gender = "Unknown";
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized Constructor with limited parameters
    public Baby(String gender) {
        this.gender = gender;
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized Constructor with some parameters
    public Baby(String gender, String name) {
        this(gender);
        this.name = name;
    }

    // Parameterized Constructor with all parameters
    public Baby(String gender, String name, int age) {
        this(gender, name);
        this.age = age;
    }

    // Getters
    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
