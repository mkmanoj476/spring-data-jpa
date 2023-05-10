package com.bezkoder.spring.oracle.service;

import com.bezkoder.spring.oracle.entity.Employee;
import com.bezkoder.spring.oracle.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getEmployee(){

        return employeeRepo.findAll();
    }
}
