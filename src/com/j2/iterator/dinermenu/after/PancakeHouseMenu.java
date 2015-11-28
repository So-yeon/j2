package com.j2.iterator.dinermenu.after;
import java.util.ArrayList;  //�ѱ۷� ���� + �ǹ�

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;
 
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("1. K&B�� ��ħ ������ũ", 
                "��ũ���� ����, �佺Ʈ�� �Բ� ������ũ�� ��ź�����", true, 2.99);
        addItem("2. �Ϲ� ��ħ ������ũ", 
                "�ް��Ķ��̿� �Ҽ����� ����� ������ũ", false, 2.99);
        addItem("3. ��纣�� ������ũ",
                "�ż��� ��纣���� ����� ������ũ", true, 3.49);
        addItem("4. ����",
                "���ÿ� ����� ������ ��纣���� ���⸦ �Բ� �÷��帳�ϴ�.", true, 3.59);
       /////////////////////////�߰�////////////////////////////////////////
        addItem("5. ���⿡ ���ݸ� ����",
                "���⿡�� ���ݸ��� ���ø�ο� �Բ� ���� ������ ������ ��������.", true, 3.69);
        addItem("6. ���ڶ� ���ݸ� ������ũ",
                "������ũ�� ���ڶ� ũ���� ȯ���� ��ȭ", true, 2.59);
        addItem("7. ���� �ս� ��Ÿ�� ��ħ��Ʈ",
                "�ż��� ����⸦ ����� ������ũ�� ��ũ���� ����, ���ڶ�ũ���� �ٸ� ���ñ��� �����սǽ�Ÿ���� ��ħ�� ��������", true, 6.00);
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
