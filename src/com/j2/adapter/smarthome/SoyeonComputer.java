package com.j2.adapter.smarthome;

public class SoyeonComputer {
    String description;
 
    public SoyeonComputer(String description) {
        this.description = description;
    }
    public void on() {
        System.out.println(description + " on");
    }
    public void off() {
        System.out.println(description + " off");
    }
    public String toString() {
        return description;
    }
}