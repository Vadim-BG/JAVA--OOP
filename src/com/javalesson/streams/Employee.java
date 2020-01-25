package com.javalesson.streams;

public class Employee {

    private int id;
    private String fistName;
    private String lastName;
    private int salary;


    public Employee(int id, String fistName, String lastName, int salary) {
        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
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
                " ID='" + id + '\'' +
                ", fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (salary != employee.salary) return false;
        if (fistName != null ? !fistName.equals(employee.fistName) : employee.fistName != null) return false;
        return lastName != null ? lastName.equals(employee.lastName) : employee.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (fistName != null ? fistName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + salary;
        return result;
    }
}
