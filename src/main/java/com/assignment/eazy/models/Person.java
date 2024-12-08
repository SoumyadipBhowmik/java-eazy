package com.assignment.eazy.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "person")
public class Person {

    private String name = "Soumyadip";

    private final Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("vehicle") Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
