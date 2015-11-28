package com.j2.iterator.dinermenu.after;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;
 
    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }
    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        
        System.out.println("< Waitress �ҿ�'s Table >\n*********************");
        System.out.println("\t�޴�\n*********************\n- ��ħ Ư���޴�");
        printMenu(pancakeIterator);
        System.out.println("\n- ���� Ư���޴�");
        printMenu(dinerIterator);
        
    }
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", $");
            System.out.print(menuItem.getPrice() + " / ���� : ");
            System.out.println(menuItem.getDescription());
        }
    }

}