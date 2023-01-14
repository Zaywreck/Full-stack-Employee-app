package com.employee.api.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.employee.api.entities.Employee;
import com.employee.api.services.Contracts.EmployeeService;

@Service
@Repository("demo")
public class DemoEmployeeManager implements EmployeeService{

    @Override
    public List<Employee> getAllEmployees() {
        var list = new ArrayList<Employee>();
        list.add(new Employee(1,"Ahmet","Can",2000.0));
        list.add(new Employee(2,"Mehmet","Lale",2500.0));
        list.add(new Employee(3,"Utku Berat","Gülle",20000.0));
        return list;
    }

    @Override
    public Employee getOneEmployeeById(int id) {
        return new Employee(3,"Utku Berat","Gülle",20000.0);
    }

    @Override
    public Employee createOneEmployee(Employee employee) {
        return new Employee(1,"Ahmet","Can",2000);
    }

    @Override
    public Employee updateOneEmployee(int id, Employee employee) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Employee deleteOneEmployee(int id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
