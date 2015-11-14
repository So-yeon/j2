package com.j2.adapter.smarthome;

public class SmartHomeTestDrive {
    public static void main(String[] args) {
        HeadfirstDesignPatternsBook headfirstDesignPatternsBook = new HeadfirstDesignPatternsBook("My HeadfirstDesignPatternsBook");
        LEDLight ledlight = new LEDLight("LEDLight");
        SoyeonComputer soyeonComputer = new SoyeonComputer("My Computer");
        DrJavaProgram drJavaProgram = new DrJavaProgram("My DrJavaProgram");
 
        SmartHomeFacade smartHome = 
          new SmartHomeFacade(headfirstDesignPatternsBook,ledlight,soyeonComputer,drJavaProgram);
        smartHome.beginStudy("Study Java!");
        smartHome.endStudy();
    }
}