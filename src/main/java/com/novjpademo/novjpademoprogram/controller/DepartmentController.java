package com.novjpademo.novjpademoprogram.controller;

import com.novjpademo.novjpademoprogram.model.Department;
import com.novjpademo.novjpademoprogram.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepo departmentRepo;

    @PostMapping(value="/savedept")
    public Department saveDept(@RequestBody Department department){
        Department d=departmentRepo.save(department);
        return d;
    }
}
