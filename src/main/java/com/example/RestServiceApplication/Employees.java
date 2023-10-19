package com.example.RestServiceApplication;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeeList;
    private int numOfEmployees;


    public List<Employee> getEmployeeList() {
        if (employeeList == null){
            return new ArrayList<>();
        }
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public boolean addEmployee(Employee e){
        if(employeeList.add(e)){
            numOfEmployees++;
            return true;
        }
        return false;
    }

    public boolean deleteEmployee(Employee e){
        if(employeeList.remove(e)){
            numOfEmployees--;
            return true;
        }
        return false;
    }
}
