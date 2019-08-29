package com.dbs.springmvcapp.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.springmvcapp.model.Employee;
import com.dbs.springmvcapp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    @Transactional
    public Employee saveEmployee(Employee employee) {

        return employeeRepository.save(employee);
    }

    @Override
    @Transactional
    public List<Employee> listAll() {
        List<Employee> list = new ArrayList<>();
        this.employeeRepository.findAll().forEach(employee -> list.add(employee));
        return list;
    }

    @Override
    @Transactional
    public Employee findById(long empId)  {
        return this.employeeRepository.findById(empId).get();
    }

    @Override
    @Transactional
    public void deleteEmployee(long empId) {
        this.employeeRepository.delete(this.employeeRepository.findById(empId).get());
    }


}