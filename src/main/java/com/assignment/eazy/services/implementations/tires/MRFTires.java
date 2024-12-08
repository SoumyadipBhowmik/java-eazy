package com.assignment.eazy.services.implementations.tires;

import com.assignment.eazy.services.Tires;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MRFTires implements Tires {
    @Override
    public String rotate() {
        return "Rotating Mrf Tires";
    }
}
