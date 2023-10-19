package com.example.RestServiceApplication;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(path="/employees")
public class EmployeeController {
    @Autowired
    private EmployeeManager employeeManager;

    @GetMapping(value = "/", produces = "application/json")
    public Employees getEmployees(){
        return employeeManager.getAllEmployees();
    }

    @PostMapping(value = "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee){
        employeeManager.addEmployee(employee);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(employee.getEmployeeID())
                .toUri();
        return ResponseEntity.created(location).build(); //201
    }
}
