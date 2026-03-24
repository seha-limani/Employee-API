package com.example.HR_System.service;

import com.example.HR_System.controller.request.EmployeeRequest;
import com.example.HR_System.controller.response.EmployeeResponse;
import com.example.HR_System.model.Employee;

import java.util.List;


public interface EmployeeService {

    void createEmployee(EmployeeRequest employeeRequest);

    List<Employee> findAll();
}
