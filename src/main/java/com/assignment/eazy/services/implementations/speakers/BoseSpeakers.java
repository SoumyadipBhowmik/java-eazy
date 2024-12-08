package com.assignment.eazy.services.implementations.speakers;

import com.assignment.eazy.services.Speaker;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speaker {
    @Override
    public String makeSound() {
        return "Playing music with Bose speakers";
    }
}
