package com.bezkoder.spring.oracle.repository;

import com.bezkoder.spring.oracle.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
