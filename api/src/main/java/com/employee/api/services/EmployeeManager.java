package com.employee.api.services;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.employee.api.entities.Employee;
import com.employee.api.entities.exceptions.EmployeeNotFoundException;
import com.employee.api.repositories.EmployeeRepository;
import com.employee.api.services.Contracts.EmployeeService;

@Service
@Repository("mysql")
// @Primary 
public class EmployeeManager implements EmployeeService{

    private final EmployeeRepository employeeRepository;
    
    public EmployeeManager(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getOneEmployeeById(int id) {
        return employeeRepository.findById(id)
        .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @Override
    public Employee createOneEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateOneEmployee(int id, Employee employee) {
        if(employee.getId() != id){
            throw new RuntimeException("please check the id");
        }
        var entity = getOneEmployeeById(id);
        // mapper
        entity.setFirstName(employee.getFirstName());
        entity.setLastName(employee.getLastName());
        entity.setSalary(employee.getSalary());
        return employeeRepository.save(entity);
    }

    @Override
    public Employee deleteOneEmployee(int id) {
        var emp = getOneEmployeeById(id);
        employeeRepository.deleteById(id);
        return emp;
    }
    
}
