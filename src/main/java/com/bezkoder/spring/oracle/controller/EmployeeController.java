package com.bezkoder.spring.oracle.controller;

import com.bezkoder.spring.oracle.entity.Employee;
import com.bezkoder.spring.oracle.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getEmployee(){
        return employeeService.getEmployee();
    }


}
