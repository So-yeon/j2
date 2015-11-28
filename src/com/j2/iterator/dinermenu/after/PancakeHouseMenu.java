package com.j2.iterator.dinermenu.after;
import java.util.ArrayList;  //한글로 수정 + 맨밑

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;
 
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("1. K&B의 아침 팬케이크", 
                "스크램블 에그, 토스트와 함께 팬케이크를 드셔보세요", true, 2.99);
        addItem("2. 일반 아침 팬케이크", 
                "달걀후라이와 소세지를 곁들인 팬케이크", false, 2.99);
        addItem("3. 블루베리 팬케이크",
                "신선한 블루베리를 곁들인 팬케이크", true, 3.49);
        addItem("4. 와플",
                "와플에 당신이 선택한 블루베리나 딸기를 함께 올려드립니다.", true, 3.59);
       /////////////////////////추가////////////////////////////////////////
        addItem("5. 벨기에 초콜릿 와플",
                "벨기에산 초콜릿을 마시멜로와 함께 녹인 달콤한 와플을 맛보세요.", true, 3.69);
        addItem("6. 누텔라 초콜릿 팬케이크",
                "팬케이크와 누텔라 크림의 환상의 조화", true, 2.59);
        addItem("7. 영국 왕실 스타일 아침세트",
                "신선한 산딸기를 곁들인 팬케이크와 스크램블 에그, 누텔라크림을 바른 와플까지 영국왕실스타일의 아침을 맛보세요", true, 6.00);
    }
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    public ArrayList getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
    public String toString() {
        return "Objectville Pancake House Menu";
    }
    // other menu methods here
}
