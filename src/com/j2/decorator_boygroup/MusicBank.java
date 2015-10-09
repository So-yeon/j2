package com.j2.decorator_boygroup;

public class MusicBank {
 public static void main(String args[]) {
  
  BoyGroup boyGroup1 = new EXO();
  boyGroup1 = new Rapper(boyGroup1);  boyGroup1 = new Rapper(boyGroup1);
  boyGroup1 = new Rapper(boyGroup1);  boyGroup1 = new MainVocal(boyGroup1);
  boyGroup1 = new MainVocal(boyGroup1);  boyGroup1 = new MainVocal(boyGroup1);
  boyGroup1 = new MainVocal(boyGroup1);  boyGroup1 = new Dancer(boyGroup1);
  boyGroup1 = new Dancer(boyGroup1);
  System.out.println(boyGroup1.getDescription() + boyGroup1.memberNum() + " Έν ");
 
  BoyGroup boyGroup2 = new SHINEE();
  boyGroup2 = new MainVocal(boyGroup2);  boyGroup2 = new MainVocal(boyGroup2);
  boyGroup2 = new Rapper(boyGroup2);  boyGroup2 = new Rapper(boyGroup2);
  boyGroup2 = new Dancer(boyGroup2);
  System.out.println(boyGroup2.getDescription() + boyGroup2.memberNum() + " Έν ");
  
  BoyGroup boyGroup3 = new BtoB();
  boyGroup3 = new MainVocal(boyGroup3);  boyGroup3 = new MainVocal(boyGroup3);
  boyGroup3 = new Dancer(boyGroup3);  boyGroup3 = new Dancer(boyGroup3);
  boyGroup3 = new Rapper(boyGroup3);  boyGroup3 = new Rapper(boyGroup3);
  System.out.println(boyGroup3.getDescription() + boyGroup3.memberNum() + " Έν");
 }
}
