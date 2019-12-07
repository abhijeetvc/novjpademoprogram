package com.novjpademo.novjpademoprogram.repository;

import com.novjpademo.novjpademoprogram.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Long> {
}
