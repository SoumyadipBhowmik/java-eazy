package com.assignment.eazy.config;

import com.assignment.eazy.models.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.assignment.eazy.models",
        "com.assignment.eazy.services.implementations"
})
public class ProjectConfig {
}
