package com.j2.templatemethod.smbarista;
import java.io.*;

public class CaramelMacchiatoWithHook extends CaffeineBeverageWithHook {
   public void brew() {
     System.out.println("Make Espresso With Cutting mill.");
   }
   public void addCondiments() {
     System.out.println("Adding Vanilla Syrup and Caramel.");
   }
   public boolean customerWantsCondiments() {
     String answer = getUserInput();

     if (answer.toLowerCase().startsWith("y")) {
       return true;
     } 
     else {
       return false;
     }
   }
   private String getUserInput() {
     String answer = null;
     System.out.print("Would you like iceMilk with your CaramelMacchiato (y/n)? ");

     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     try {
       answer = in.readLine();
     } 
     catch (IOException ioe) {
       System.err.println("IO error trying to read your answer");
     }
     if (answer == null) {
       return "no";
     }
     return answer;
   }
}