package com.dbs.springmvcapp.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dbs.springmvcapp.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    public Optional<Employee> findByName(String name);
}
