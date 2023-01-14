package com.employee.api.services.Contracts;

import java.util.List;

import com.employee.api.entities.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getOneEmployeeById(int id);
    Employee createOneEmployee(Employee employee);
    Employee updateOneEmployee(int id, Employee employee);
    Employee deleteOneEmployee(int id);
}
