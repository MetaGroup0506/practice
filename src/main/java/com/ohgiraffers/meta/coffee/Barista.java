package com.ohgiraffers.meta.coffee;

public class Barista {

    /*
    * 주문에 따라 커피를 만들어라(커피를 제공)
    * */
    private int coffeeStock = 5000; // 5000g 커피보유

    public Coffee[] makeCoffee(Order order) {

        // 재고 차감 처리 --> 커피한잔에 20g사용

        // coffee 생성
        Coffee[] coffees = new Coffee[order.getCount()];
        for(int i = 0; i < coffees.length; i++) {
            coffees[i] = new Coffee(order.getMenuName(), order.getOption());
        }

        return coffees;
    }
}
