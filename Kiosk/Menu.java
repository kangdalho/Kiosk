package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<String> categories;
    private List<MenuItem> menuItems;

    public Menu() {
        this.categories = new ArrayList<>();
        this.menuItems = new ArrayList<>();
        initCategories();
        initMenuItems();
    }

    private void initCategories() {
        // 카테고리 메뉴
        categories.add("BURGERS");
        categories.add("DRINKS");
        categories.add("DESSERTS");
    }


    private void initMenuItems() {
        // Burgers 메뉴
        menuItems.add(new MenuItem("ShackBurger", "W6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", "BURGERS"));
        menuItems.add(new MenuItem("SmokeShack", "W8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", "BURGERS"));
        menuItems.add(new MenuItem("CheeseBurger", "W6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", "BURGERS"));
        menuItems.add(new MenuItem("Hamburger", "W5.4", "비프패티를 기반으로 야채가 들어간 기본버거", "BURGERS"));

        // Drinks 메뉴
        menuItems.add(new MenuItem("ZeroCoke", "W2.0", "건강한 제로 음료 콜라", "DRINKS"));
        menuItems.add(new MenuItem("ZeroSprite", "W2.0", "건강한 제로 음료 사이다", "DRINKS"));

        // Desserts 메뉴
        menuItems.add(new MenuItem("FrenchFries", "W3.5", "황금올리브로 튀겨 낸 바삭한 감자튀김", "DESSERTS"));
        menuItems.add(new MenuItem("ChickenBall", "W4.5", "황금올리브로 튀겨 낸 바삭한 치킨볼", "DESSERTS"));
    }

    public List<String> getCategories() {
        return categories; // 메뉴 카테고리 리스트 반환
    }

    public List<MenuItem> getMenuItemsBYCategory(String category) {
        List<MenuItem> filteredItems = new ArrayList<>();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals(category)) {
                filteredItems.add(item);
            }
        }
      return filteredItems;
    }
}
