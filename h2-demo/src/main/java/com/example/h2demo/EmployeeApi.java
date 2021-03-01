package com.example.h2demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class EmployeeApi {

    public List<Employee> employees;

    public EmployeeApi(){
        employees=new ArrayList<>();
    }



}
