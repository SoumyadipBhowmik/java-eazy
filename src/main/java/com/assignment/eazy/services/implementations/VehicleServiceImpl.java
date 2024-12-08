package com.assignment.eazy.services.implementations;

import com.assignment.eazy.services.Speaker;
import com.assignment.eazy.services.Tires;
import com.assignment.eazy.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {

    private Speaker speaker;
    private Tires tires;

    @Autowired
    VehicleServiceImpl(Speaker speaker, Tires tires){
        this.speaker = speaker;
        this.tires = tires;
    }

    @Override
    public void play() {
        String music = speaker.makeSound();
        System.out.println(music);
    }

    @Override
    public void rotate() {
        String status = tires.rotate();
        System.out.println(status);
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }
}
