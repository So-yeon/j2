package com.j2.adapter.smarthome;

public class LEDLight {
    String description;
    int illumination;
 
    public LEDLight(String description) {
        this.description = description;
    }
    public void on() {
        System.out.println(description + " on");
    }
    public void off() {
        System.out.println(description + " off");
    }
    public void setIllumination(int illumination) {
        System.out.println(description + " setting LED Light illumination to " + illumination +"lux");
        this.illumination = illumination;
    }
    public String toString() {
        return description;
    }
}