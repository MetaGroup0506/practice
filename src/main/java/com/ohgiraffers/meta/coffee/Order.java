package com.ohgiraffers.meta.coffee;

public class Order {

    private final String menuName;
    private final String option;
    private final int count;

    public Order(String menuName, String option, int count) {
        this.menuName = menuName;
        this.option = option;
        this.count = count;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getOption() {
        return option;
    }

    public int getCount() {
        return count;
    }
}
