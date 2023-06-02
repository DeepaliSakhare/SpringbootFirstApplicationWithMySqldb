package com.mahagan.SpringBootFirstApplicationWithMySqlDB.service;

import com.mahagan.SpringBootFirstApplicationWithMySqlDB.domain.Department;
import com.mahagan.SpringBootFirstApplicationWithMySqlDB.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    // Save operation
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    // Read operation
    @Override
    public List<Department> fetchDepartmentList() {
        return (List<Department>) departmentRepository.findAll();
    }


    // Update operation
    public Department updateDepartment(Department department, int department_id) {
        Department dept = departmentRepository.findById(department_id).get();

        if (Objects.nonNull(department.getDepartment_id())
                && !"".equalsIgnoreCase(department.getDepartment_name())) {
            dept.setDepartment_name(department.getDepartment_name());
        }

        if (Objects.nonNull(department.getDepartment_id())
                && !"".equalsIgnoreCase(department.getDepartment_code())) {
            dept.setDepartment_code(department.getDepartment_code());
        }

        if (Objects.nonNull(department.getDepartment_id())
                && !"".equalsIgnoreCase(department.getDepartment_address())) {
            dept.setDepartment_address(department.getDepartment_address());
        }

        return departmentRepository.save(dept);
    }

    // Delete Operation
    public void deleteDepartmentById(int department_id) {
        departmentRepository.deleteById(department_id);
    }
}
