package com.mahagan.SpringBootFirstApplicationWithMySqlDB.repository;


import com.mahagan.SpringBootFirstApplicationWithMySqlDB.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    //Interface for data manipulation


}
