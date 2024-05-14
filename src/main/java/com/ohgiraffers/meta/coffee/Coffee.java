package com.ohgiraffers.meta.coffee;

public class Coffee {

    private final String coffeeName;
    private final String option;

    public Coffee(String coffeeName,String option) {
        this.coffeeName = coffeeName;
        this.option = option;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public String getOption() {
        return option;
    }

    @Override
    public String toString() {
        return "%s(%s)".formatted(coffeeName, option);
    }
}
