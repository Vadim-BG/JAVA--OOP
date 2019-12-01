package com.javalesson.lambdas.model;

public class Employee {

    private String fistName;
    private String lastName;
    private int salary;

//    public Employee() {
//    }

    public Employee(String fistName, String lastName, int salary) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.salary = salary;
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

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
