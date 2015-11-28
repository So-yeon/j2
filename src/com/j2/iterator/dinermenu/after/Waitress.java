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
        
        System.out.println("< Waitress 소연's Table >\n*********************");
        System.out.println("\t메뉴\n*********************\n- 아침 특선메뉴");
        printMenu(pancakeIterator);
        System.out.println("\n- 점심 특선메뉴");
        printMenu(dinerIterator);
        
    }
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", $");
            System.out.print(menuItem.getPrice() + " / 설명 : ");
            System.out.println(menuItem.getDescription());
        }
    }

}