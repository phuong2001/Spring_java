package com.example.tranvanphuong.controller;

import com.example.tranvanphuong.entity.EmployeesEntity;
import com.example.tranvanphuong.model.BaseResponse;
import com.example.tranvanphuong.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public ResponseEntity getEmployee(){
        List<EmployeesEntity> list = employeeService.getAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping
    public ResponseEntity createEmployee(@RequestBody EmployeesEntity p){
        EmployeesEntity data = employeeService.createEmployee(p);
        BaseResponse res = new BaseResponse();
        res.data = data;
        return ResponseEntity.ok(res);
    }
}
