package com.employee.api.entities.exceptions;

public class EmployeeNotFoundException extends NotFoundException{

    public EmployeeNotFoundException(int id) {
        super(String.format("Employee with id : %d could not be found ",id));
    }
    
}
