package com.j2.singleton.printspooler;

public class PrintSpoolerController{
    public static void main (String[] args) {
    PrintSpooler spooler1 = PrintSpooler.getInstance();
    spooler1.fullPrinter();
    spooler1.printPreparing();
    spooler1.print();
    
    PrintSpooler spooler2 = PrintSpooler.getInstance();
  }
}