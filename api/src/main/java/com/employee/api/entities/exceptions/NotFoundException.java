package com.employee.api.entities.exceptions;

public abstract class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
    
}
