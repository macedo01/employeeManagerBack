package com.mcd.employeemanager.model;


import jakarta.persistence.*;
import lombok.Data;

import javax.validation.constraints.Size;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Size(min = 1,max = 50)
    @Column(name = "name")
    private String name;
    @Size(min = 1,max = 50)
    @Column(name = "email")
    private String email;
    @Size(min = 1,max = 50)
    @Column(name = "job_tile")
    private String jobTile;
    @Size(min = 1,max = 25)
    @Column(name = "phone")
    private String phone;
    @Size(min = 1,max = 100)
    @Column(name = "image_url")
    private String imageUrl;
    @Column(nullable = false, updatable = false, name = "employee_code")
    @Size(min = 1,max = 3)
    private String employeeCode;
}
