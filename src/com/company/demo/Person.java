package com.company.demo;

public class Person {
    private String name;
    private String gender;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("Name: %s | Gender: %s",
                this.name,
                this.gender);
    }
}