package com.novjpademo.novjpademoprogram.controller;

import com.novjpademo.novjpademoprogram.model.Employee;
import com.novjpademo.novjpademoprogram.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping(value="/saveemp")
    public String saveEmp(@RequestBody Employee employee){
        employeeRepo.save(employee);
        return "Data saved";
    }

    @GetMapping(value="/getemp")
    public List<Employee> getEmp(){
        return employeeRepo.findAll();
    }

    @GetMapping(value="/findemp/{id}")
    public Optional<Employee> findEmp(@PathVariable Long id){
        return employeeRepo.findById(id);
    }


}
