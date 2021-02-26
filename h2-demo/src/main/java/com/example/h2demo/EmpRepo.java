package com.example.h2demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
@Repository
public interface EmpRepo extends CrudRepository<Employee, Integer> {

    @GetMapping("/all")
    List<Employee> findAll();

    @GetMapping("/gender")
    List<Employee> findAllByGender(String gender);

    @GetMapping()
    public Employee getById(@RequestParam Integer index);

}
