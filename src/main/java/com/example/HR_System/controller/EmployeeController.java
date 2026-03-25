package com.example.HR_System.controller;

import com.example.HR_System.controller.request.EmployeeRequest;
import com.example.HR_System.controller.response.EmployeeResponse;
import com.example.HR_System.model.Employee;
import com.example.HR_System.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public void createEmployee(@RequestBody EmployeeRequest employeeRequest){
        employeeService.createEmployee(employeeRequest);
    }

    @GetMapping("/employees")
    public List<EmployeeResponse> findAll(){
        List<Employee> EmployeeList = employeeService.findAll();

        List<EmployeeResponse> employeeResponseList = new ArrayList<>();

        for (Employee employee : EmployeeList){
            EmployeeResponse employeeResponse = new EmployeeResponse();
            employeeResponse.setEmail(employee.getEmail());
            employeeResponse.setName(employee.getName());

            employeeResponseList.add(employeeResponse);
        }
      return employeeResponseList;
    }
@PostMapping("/Test")
public void test(){
    System.out.println("check code");
}
}
