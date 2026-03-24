package com.example.HR_System.service.Impl;
import com.example.HR_System.controller.request.EmployeeRequest;
import com.example.HR_System.controller.response.EmployeeResponse;
import com.example.HR_System.model.Employee;
import com.example.HR_System.repository.EmployeeRepository;
import com.example.HR_System.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void createEmployee(EmployeeRequest employeeRequest) {

        Employee employee = new Employee();
       employee.setName(employeeRequest.getName());
       employee.setEmail(employeeRequest.getEmail());


       

      
        employeeRepository.createEmployee(employee);

    }

    @Override
    public List<Employee> findAll() {

        return employeeRepository.findAll();
    }


}
