package com.assignment.eazy.services.implementations.tires;

import com.assignment.eazy.services.Tires;
import org.springframework.stereotype.Component;

@Component
public class MichelinTires implements Tires {
    @Override
    public String rotate() {
        return "Rotating Michelin tires";
    }
}
