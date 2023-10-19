package com.example.RestServiceApplication;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeeList;
    private int numOfEmployees;


    public List<Employee> getEmployeeList() {
        if (employeeList == null) {
            employeeList = new ArrayList<>(); // if you write return new ArrayList<>(), then no one store it
        }
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public int getNumOfEmployees() {
        if (employeeList == null){
            return 0;
        }
        return employeeList.size();
    }

}
