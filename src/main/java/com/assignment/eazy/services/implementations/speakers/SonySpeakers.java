package com.assignment.eazy.services.implementations.speakers;

import com.assignment.eazy.services.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SonySpeakers implements Speaker {
    @Override
    public String makeSound() {
        return "Playing music with Sony Speaker";
    }
}
