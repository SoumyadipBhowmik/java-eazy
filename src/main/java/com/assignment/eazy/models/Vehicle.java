package com.assignment.eazy.models;

import com.assignment.eazy.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "vehicle")
public class Vehicle {

    private String name = "Buggati";
    private final VehicleService vehicleService;

    @Autowired
    public Vehicle(VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }
}
