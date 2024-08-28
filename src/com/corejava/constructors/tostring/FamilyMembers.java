package com.corejava.constructors.tostring;

public class FamilyMembers {

    private String name;
    private int age;
    private String gender;

    public FamilyMembers(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Name: " + name + " Age: " + age + " Gender: " + gender;
    }
}
