package com.novjpademo.novjpademoprogram.repository;

import com.novjpademo.novjpademoprogram.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
