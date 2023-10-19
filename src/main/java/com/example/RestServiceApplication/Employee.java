package com.example.RestServiceApplication;

public class Employee {
    private String firstName;
    private String lastName;
    private String employeeID;
    private String email;
    private String title;

    public Employee(String firstName, String lastName, String employeeID, String email, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.email = email;
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
