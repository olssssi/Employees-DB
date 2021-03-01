package com.example.h2demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
@Repository
public interface EmpRepo extends CrudRepository<Employee, Integer> {


    @GetMapping("/all")
    public List<Employee> findAll();

    @GetMapping("/gender")
    public List<Employee> findAllByGender(@RequestParam String gender);

    @GetMapping("/job")
    public List<Employee> findAllByJob(@RequestParam String job);

    @GetMapping()
    public Employee getById(@RequestParam Integer index);




}
