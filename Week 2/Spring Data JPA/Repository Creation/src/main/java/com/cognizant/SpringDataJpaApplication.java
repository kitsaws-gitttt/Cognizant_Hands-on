package com.cognizant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    @Override
    public void run(String... args) {

        repository.save(new Employee("Sahil", "Cyber Security"));
        repository.save(new Employee("Rahul", "IT"));
        repository.save(new Employee("Aman", "Cyber Security"));

        List<Employee> employees = repository.findByDepartment("Cyber Security");

        System.out.println("Employees in Cyber Security:");

        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}