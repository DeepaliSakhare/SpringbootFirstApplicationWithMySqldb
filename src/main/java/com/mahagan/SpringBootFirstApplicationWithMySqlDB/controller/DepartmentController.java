package com.mahagan.SpringBootFirstApplicationWithMySqlDB.controller;


// Annotation for controller

import com.mahagan.SpringBootFirstApplicationWithMySqlDB.domain.Department;
import com.mahagan.SpringBootFirstApplicationWithMySqlDB.service.DepartmentService;
import com.mahagan.SpringBootFirstApplicationWithMySqlDB.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    //i have added some line here

    @Autowired
    DepartmentServiceImpl departmentService;

    @PostMapping("/department")
    //Save the operation
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    //Read the operation
    @GetMapping("/department")
    public List<Department> fetchDepartmentList() {
        return departmentService.fetchDepartmentList();
    }

    //Update the operation
    @PutMapping("/department/{id}")
    public Department updateDepartment(@RequestBody Department department,
                                       @PathVariable("id") int department_id) {
        return departmentService.updateDepartment(department, department_id);
    }
    //Delete the operation

    @DeleteMapping("/department/{id}")
    public String deleteDepartmentById(@PathVariable("id") int department_id) {

        departmentService.deleteDepartmentById(department_id);
        return "Resource has been deleted successfully ";
    }

}
