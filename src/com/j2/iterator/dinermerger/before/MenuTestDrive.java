package com.j2.iterator.dinermerger.before;
import java.util.ArrayList;
public class MenuTestDrive {
  public static void main(String args[]) {
    //PancakeHouseMenu p= new PancakeHouseMenu();
    //DinerMenu d = new DinerMenu();
    printMenu();
  }
  
  //여기서만 쓰니 private로 써야함.
  public static void printMenu(){
    PancakeHouseMenu p= new PancakeHouseMenu();
    DinerMenu d = new DinerMenu();
    ArrayList pitems = p.getMenuItems(); //breakfastItems = pitems
    for (int i=0; i<pitems.size(); i++){
      MenuItem menuitem = (MenuItem)pitems.get(i);  //차이를 느끼라.get(i)
      System.out.println(menuitem.getName());
    }
    
    MenuItem[] ditems = d.getMenuItems();
    for (int i=0; i<ditems.length; i++){
      MenuItem menuitem = ditems[i];
      System.out.println(menuitem.getName());
    }
  }
}
