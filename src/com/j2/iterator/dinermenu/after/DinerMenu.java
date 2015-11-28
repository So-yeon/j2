package com.j2.iterator.dinermenu.after;
//한글메뉴 작성
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 9;
    int numberOfItems = 0;
    MenuItem[] menuItems;
  
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
 
        addItem("1. 채식주의자의 BLT 샌드위치",
                "가짜 베이컨과 양상추 & 통밀빵에 토마토 토핑", true, 2.99);
        addItem("2. 일반 BLT 샌드위치",
                "베이컨과 양상추 & 통밀빵에 토마토 토핑", false, 2.99);
        addItem("3. 오늘의 수프",
                "오늘의 수프와 사이드메뉴인 감자샐러드", false, 3.29);
        addItem("4. 핫도그",
                "소금에 절인 양배추,렐리시,양파등을 치즈와 함께 핫도그에 토핑해드립니다.", false, 3.05);
        addItem("5. 더운 야채와 볶음밥",
                "더운 야채와 함께 맛있게 볶아낸 볶음밥", true, 3.99);
        addItem("6. 파스타",
                "홈메이드식 마리나라소스와 사워도우 빵을 스파게티와 함께 곁들여 드셔보세요.", true, 3.89);
        
        addItem("7. 한국식 까르보나라 파스타",
                "까르보나라 치즈 소스로 만든 스파게티를 베이컨,양송이와 함께 곁들여 드셔보세요.", true, 4.89);
        addItem("8. 정통 이탈리안 까르보나라 파스타",
                "판체타와 촉촉한 달걀, 치즈와 함께 정통 이탈리안 까르보나라 파스타를 맛보세요.", false, 5.14);
        addItem("9. 이태리 스타일 점심세트",
                "정통 이탈리안 까르보나라 파스타와 오늘의 수프, 사워도우 빵까지 이태리스타일의 점심을 맛보세요", true, 6.00);
    }
    public void addItem(String n, String d, boolean v, double p) {
        MenuItem menuItem = new MenuItem(n, d, v, p);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
    // other menu methods here
}