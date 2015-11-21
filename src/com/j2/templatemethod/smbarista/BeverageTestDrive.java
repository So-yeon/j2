package com.j2.templatemethod.smbarista;

public class BeverageTestDrive {
  public static void main(String[] args) {
    //�׳� ��¸� �ϴ� ���� 
    Tea tea = new Tea();
    Coffee coffee = new Coffee();
    CaramelMacchiato caramelMacchiato = new CaramelMacchiato();
 
    System.out.println("\nMaking tea...");
    tea.prepareRecipe();
    System.out.println("\nMaking coffee...");
    coffee.prepareRecipe();
    System.out.println("\nMaking caramelMacchiato...");
    caramelMacchiato.prepareRecipe();
 
    //Hook���� �����ؼ� �ൿ�� �������� ����
    TeaWithHook teaHook = new TeaWithHook();
    CoffeeWithHook coffeeHook = new CoffeeWithHook();
    CaramelMacchiatoWithHook caramelMacchiatoWithHook = new CaramelMacchiatoWithHook();
 
    System.out.println("\nMaking tea...");
    teaHook.prepareRecipe();
 
    System.out.println("\nMaking coffee...");
    coffeeHook.prepareRecipe();
    
    System.out.println("\nMaking caramelMacchiato...");
    caramelMacchiatoWithHook.prepareRecipe();
  }
}