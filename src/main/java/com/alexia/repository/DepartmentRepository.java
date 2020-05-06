package com.alexia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexia.model.Department;

@Repository("departmentRepository")
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}

