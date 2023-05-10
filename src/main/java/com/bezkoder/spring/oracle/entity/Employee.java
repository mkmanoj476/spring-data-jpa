package com.bezkoder.spring.oracle.entity;

import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    private Long emloyeeId;

    @Column(name="employee_name")
    private String employeeName;
    @Column(name="company_name")
    private String companyName;

    public Employee() {
    }

    public Employee(Long emloyeeId, String employeeName, String companyName) {
        this.emloyeeId = emloyeeId;
        this.employeeName = employeeName;
        this.companyName = companyName;
    }

    public Long getEmloyeeId() {
        return emloyeeId;
    }

    public void setEmloyeeId(Long emloyeeId) {
        this.emloyeeId = emloyeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emloyeeId=" + emloyeeId +
                ", employeeName='" + employeeName + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
