package com.example.tranvanphuong.service;

import com.example.tranvanphuong.entity.EmployeesEntity;
import com.example.tranvanphuong.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService{

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public List<EmployeesEntity> getAll() {
        return employeeRepo.findAll();
    }

    @Override
    public EmployeesEntity createEmployee(EmployeesEntity p) {
        return employeeRepo.save(p);
    }

    @Override
    public EmployeesEntity findAllEmployee(int id) {
        return employeeRepo.findById(id).get();
    }
}
