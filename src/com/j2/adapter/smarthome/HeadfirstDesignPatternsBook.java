package com.j2.adapter.smarthome;

public class HeadfirstDesignPatternsBook {
    String description;
 
    public HeadfirstDesignPatternsBook(String description) {
        this.description = description;
    }
    public void open() {
        System.out.println(description + " open");
    }
    public void close() {
        System.out.println(description + " close");
    }
    public String toString() {
        return description;
    }
}