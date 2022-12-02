package com.example.cloudpractice.controller;

import com.example.cloudpractice.domain.Employee;
import com.example.cloudpractice.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employee")
    public List<String> getHelloMessage() {
        return employeeRepository.findAll().stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
    }
}
