package com.j2.adapter.smarthome;

public class SmartHomeFacade {
    private HeadfirstDesignPatternsBook headfirstDesignPatternsBook;
    private LEDLight ledlight;
    private SoyeonComputer soyeonComputer;
    private DrJavaProgram drJavaProgram;
 
    public SmartHomeFacade(HeadfirstDesignPatternsBook headfirstDesignPatternsBook, 
                             LEDLight ledlight, SoyeonComputer soyeonComputer, DrJavaProgram drJavaProgram) {
        this.headfirstDesignPatternsBook = headfirstDesignPatternsBook;
        this.ledlight = ledlight;
        this.soyeonComputer = soyeonComputer;
        this.drJavaProgram = drJavaProgram;
    }
    
    public void beginStudy(String study) {
        System.out.println("\n"+"Soyeon! It's time to Study~");
        ledlight.on();
        ledlight.setIllumination(500);
        headfirstDesignPatternsBook.open();
        soyeonComputer.on();
        drJavaProgram.on();
        
    }
    public void endStudy() {
        System.out.println("I'm study hard today.. It's time to play!");
        drJavaProgram.off();
        soyeonComputer.off();
        headfirstDesignPatternsBook.close();
        ledlight.setIllumination(0);
        ledlight.off();
    }

}