package com.example.kiosk;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private Menu menu;
    private Scanner sc;

    public Kiosk() {
        this.menu = new Menu();
        this.sc = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            try {
                System.out.println("[MAIN MENU]");
                List<String> categories = menu.getCategories();
                for (int i = 0; i < categories.size(); i++) {
                    System.out.println((i + 1) + "." + categories.get(i));
                }
                System.out.println("0. 종료 | 종료");
                System.out.println("메뉴를 선택하세요");

                int choice = sc.nextInt();
                sc.nextLine();

                if (choice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                if (choice > categories.size()) {
                    System.out.println("올바른 번호를 입력하세요.");
                    continue;
                }
                String selectedCategory = categories.get(choice - 1);
                System.out.println("[" + selectedCategory + " MENU]");

                List<MenuItem> items = menu.getMenuItemsBYCategory(selectedCategory);
                for (int i = 0; i < items.size(); i++) {
                    System.out.println((i + 1) + "." + items.get(i));
                }
                System.out.println("메뉴를 선택하세요");
                int choice2 = sc.nextInt();
                sc.nextLine();

                if (choice2 >  items.size()) {
                    System.out.println("올바른 번호를 입력하세요.");
                    continue;
                }

                MenuItem selectedItem = items.get(choice2 - 1);
                System.out.println("선택한 메뉴 = " + selectedItem.getName() + " | " + selectedItem.getPrice() + " | ");

                System.out.println("더 고르시겠습니까? (1: 예, 0: 아니요)");
                int morechoice = sc.nextInt();
                sc.nextLine();

                if (morechoice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요.");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
