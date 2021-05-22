package com.example.tranvanphuong.repository;

import com.example.tranvanphuong.entity.EmployeesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeesEntity, Integer> {

}
