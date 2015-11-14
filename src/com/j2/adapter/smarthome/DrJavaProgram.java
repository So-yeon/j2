package com.j2.adapter.smarthome;

public class DrJavaProgram {
    String description;
 
    public DrJavaProgram(String description) {
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