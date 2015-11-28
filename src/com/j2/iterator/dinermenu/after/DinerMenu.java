package com.j2.iterator.dinermenu.after;
//�ѱ۸޴� �ۼ�
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 9;
    int numberOfItems = 0;
    MenuItem[] menuItems;
  
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
 
        addItem("1. ä���������� BLT ������ġ",
                "��¥ �������� ����� & ��л��� �丶�� ����", true, 2.99);
        addItem("2. �Ϲ� BLT ������ġ",
                "�������� ����� & ��л��� �丶�� ����", false, 2.99);
        addItem("3. ������ ����",
                "������ ������ ���̵�޴��� ���ڻ�����", false, 3.29);
        addItem("4. �ֵ���",
                "�ұݿ� ���� �����,������,���ĵ��� ġ��� �Բ� �ֵ��׿� �����ص帳�ϴ�.", false, 3.05);
        addItem("5. ���� ��ä�� ������",
                "���� ��ä�� �Բ� ���ְ� ���Ƴ� ������", true, 3.99);
        addItem("6. �Ľ�Ÿ",
                "Ȩ���̵�� ��������ҽ��� ������� ���� ���İ�Ƽ�� �Բ� ��鿩 ��ź�����.", true, 3.89);
        
        addItem("7. �ѱ��� ������� �Ľ�Ÿ",
                "������� ġ�� �ҽ��� ���� ���İ�Ƽ�� ������,����̿� �Բ� ��鿩 ��ź�����.", true, 4.89);
        addItem("8. ���� ��Ż���� ������� �Ľ�Ÿ",
                "��üŸ�� ������ �ް�, ġ��� �Բ� ���� ��Ż���� ������� �Ľ�Ÿ�� ��������.", false, 5.14);
        addItem("9. ���¸� ��Ÿ�� ���ɼ�Ʈ",
                "���� ��Ż���� ������� �Ľ�Ÿ�� ������ ����, ������� ������ ���¸���Ÿ���� ������ ��������", true, 6.00);
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