package com.example.h2demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
@Component
public class Start {

    private EmpRepo empRepo;

    @Autowired
    public Start(EmpRepo empRepo) {
        this.empRepo = empRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runExample(){
        //Employee employee = new Employee("Example1", "Example1", "Female", "Junior Java Developer", 5000.00, 0.00, "example1.mail.com", "999999999");
        //empRepo.save(employee);

        //Iterable<Employee> all = empRepo.findAllByGender("Female");
        //all.forEach(System.out::println);

    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        if(empRepo.getById(employee.getId())==null)
            return empRepo.save(employee);
        else
            return null;
    }

    @PutMapping
    public Employee uptadeEmployee(@RequestBody Employee employee){
        if(empRepo.getById(employee.getId())==null)
            return null;
        else
            return empRepo.save(employee);
    }

    @DeleteMapping
    public void deleteEmployee(@RequestParam Integer index){
        if(empRepo.getById(index)!=null)
            empRepo.deleteById(index);
    }

}
