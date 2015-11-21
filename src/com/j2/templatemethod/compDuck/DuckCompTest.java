package com.j2.templatemethod.compDuck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DuckCompTest {
  public static void main(String[] args) {
    String[] data = {"Daffy,8","Dewey,2","Howard,7","Louie,2","Donald,9","Huey,2"};
 
    List<String[]> list = new ArrayList<String[]>(); 
    String[] temp;
        
    for (String str : data) {
      temp = str.split(",");
      list.add(temp);
    }
    // 정렬 전 
    System.out.println("Before sorting :");
    for(String[] array : list){
      for (String str : array) {
        System.out.print(str+ "\t");
      }
      System.out.println();
    }
    
    Collections.sort(list, new DuckCompare());
        
    // 정렬 후
    System.out.println("\nAfter sorting :");
    for(String[] array : list){
      for (String str : array) {
        System.out.print(str+ "\t");
      }
      System.out.println();
    }
  }
  static class DuckCompare implements Comparator<String[]> {
    public int compare(String[] arg0, String[] arg1) {
      String a = arg0[1].replaceAll("name"," ").replaceAll("weight", "")
        , b = arg1[1].replaceAll("name" ," ").replaceAll("weight", ""); 
      return a.compareTo(b);
    }
  }
}