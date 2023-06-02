package com.mahagan.SpringBootFirstApplicationWithMySqlDB.domain;


//Annotation for domain Class's level that has to use everytime


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int department_id;
    private String department_address;
    private String department_code;
    private String department_name;

}
