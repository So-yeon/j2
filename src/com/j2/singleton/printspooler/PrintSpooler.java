package com.j2.singleton.printspooler;
//dcl·Î ±¸Çö (double checking locking) - volatile
public class PrintSpooler {
  private volatile static PrintSpooler uniqueInstance;
  private boolean empty;
  private boolean printing;
  private static int numCalled = 0; 
 
  private PrintSpooler() {
    empty = true;
    printing = false;
  }
  
  public static PrintSpooler getInstance () {
    if (uniqueInstance == null) {
      System.out.println("*** Preparing print and Creating uniqueInstance of PrintSpooler ***");
    }
      synchronized (PrintSpooler.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new PrintSpooler();
        }
      }
    System.out.println("** Returning instance of PrintSpooler! **");
    System.out.println("Spooler's NumCalled : "+numCalled++ +"\n");
    return uniqueInstance;
  }
  
  public void printPreparing() {
    if (!isEmpty() && isPrinting()) {
      empty = true;
    }
  }
  
  public void print() {
    if (!isEmpty() && !isPrinting()) {
      printing = true;
    }
  }
  
  public void fullPrinter() {
    if (isEmpty()) {
      empty = false;
      printing = false;
    }
 }
 public boolean isEmpty() {
  return empty;
 }
 
 public boolean isPrinting() {
  return printing;
 }
}