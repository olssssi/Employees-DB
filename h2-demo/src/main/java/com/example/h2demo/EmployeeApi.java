package com.example.h2demo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeApi {

    public List<Employee> employees;

    public EmployeeApi(){
        employees=new ArrayList<>();
        Employee employee = new Employee("Example1", "Example1", "Female", "Junior Java Developer", 5000.00, 0.00, "example1.mail.com", "999999999");
        employees.add(employee);
    }

}
