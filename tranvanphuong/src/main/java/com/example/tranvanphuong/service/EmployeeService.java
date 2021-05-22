package com.example.tranvanphuong.service;

import com.example.tranvanphuong.entity.EmployeesEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeesEntity> getAll();
    EmployeesEntity createEmployee(EmployeesEntity p);
    EmployeesEntity findAllEmployee(int id);
}
