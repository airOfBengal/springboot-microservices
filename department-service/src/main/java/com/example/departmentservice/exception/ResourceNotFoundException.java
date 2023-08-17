package com.example.departmentservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    private String resourceName;
    private String resourceField;
    private String resourceValue;

    public ResourceNotFoundException(String resourceName, String resourceField, String resourceValue){
        super(String.format("% not found with %s : '%s'", resourceName, resourceField, resourceValue));
        this.resourceName = resourceName;
        this.resourceField = resourceField;
        this.resourceValue = resourceValue;
    }
}
