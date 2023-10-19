package com.example.RestServiceApplication;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeManager {
    private static Employees list = new Employees();

    static
    {
        Employee employee1 = new Employee("f1","l1","1","1@gmail.com","t1");
        Employee employee2 = new Employee("f2","l2","2","2@gmail.com","t2");
        Employee employee3 = new Employee("f3","l3","3","3@gmail.com","t3");

        list.getEmployeeList().add(employee1);
        list.getEmployeeList().add(employee2);
        list.getEmployeeList().add(employee3);
    }

    public Employees getAllEmployees(){
        return list;
    }

    public void addEmployee(Employee e){
        list.getEmployeeList().add(e);
    }
    public void removeEmployee(Employee e){
        list.getEmployeeList().remove(e);
    }

}
