package com.javalesson.lambdas.model;

public class Person {

    private String fistName;
    private String lastName;
    private int age;

    public Person(String fistName, String lastName, int age) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
