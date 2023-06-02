package com.mahagan.SpringBootFirstApplicationWithMySqlDB.service;

import com.mahagan.SpringBootFirstApplicationWithMySqlDB.domain.Department;

import java.util.List;

public interface DepartmentService {


    //Save the operation
    Department saveDepartment(Department department);

    //Read the operation
    List<Department> fetchDepartmentList();

    //Update the operation
    Department updateDepartment(Department department, int department_id);

    //Delete the operation
    void deleteDepartmentById(int department_id);

}
