package com.javalesson.lambdas.model;

public class RichPerson {

    private String fistName;
    private String lastName;
    private int salary;
    private int age;

    public RichPerson(String fistName, String lastName, int salary, int age) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "RichPerson{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary + '\'' +
                ", age=" + age +
                '}';
    }
}
