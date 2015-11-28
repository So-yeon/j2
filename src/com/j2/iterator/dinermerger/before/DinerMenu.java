package com.j2.iterator.dinermerger.before;

public class DinerMenu {
  static final int MAX_ITEMS = 3; //�޴��� ������ ���س���
  int numberOfItems = 0;
  MenuItem[] menuItems;
  
  public DinerMenu() { //Menu����� �� 3���� ��� ����ϴ�
    menuItems = new MenuItem[MAX_ITEMS]; //���� True�� ���� �ϴ� �� ������.
    addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
    addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
    addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
  }
  
  public void addItem(String n, String d, boolean v, double p) {
    MenuItem menuItem = new MenuItem(n,d,v,p);
    if(numberOfItems >= MAX_ITEMS) {
      System.out.println("Sorry full.");
    }
    else {
      menuItems[numberOfItems] = menuItem;
      numberOfItems += 1;
    }
  }
  
  public MenuItem[] getMenuItems() { //array�� ���� �� �Ʊ�ʹ� �ٸ�  �������̽� ���.
    return menuItems;
  }
}