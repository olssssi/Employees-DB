package com.example.h2demo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String first_name;
    private String last_name;
    private String gender;
    private String job;
    private double salary;
    private double bonus;
    private String email;
    private String phone;

    public Employee(String first_name, String last_name, String gender, String job, double salary, double bonus, String email, String phone) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.job = job;
        this.salary = salary;
        this.bonus = bonus;
        this.email = email;
        this.phone = phone;
    }
}
