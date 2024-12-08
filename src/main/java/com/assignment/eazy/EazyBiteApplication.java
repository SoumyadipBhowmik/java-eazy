package com.assignment.eazy;

import com.assignment.eazy.config.ProjectConfig;
import com.assignment.eazy.models.Person;
import com.assignment.eazy.models.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EazyBiteApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        String[] vehicles = context.getBeanNamesForType(Vehicle.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleService().play();
        vehicle.getVehicleService().rotate();

    }
}
