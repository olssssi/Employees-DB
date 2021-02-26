package com.example.h2demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpRepo extends CrudRepository<Employee, Integer> {

    List<Employee> findAllByGender(String gender);

}
