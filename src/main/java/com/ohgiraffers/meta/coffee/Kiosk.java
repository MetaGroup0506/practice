package com.ohgiraffers.meta.coffee;

import java.util.Arrays;
import java.util.Scanner;

public class Kiosk {

    private Scanner sc = new Scanner(System.in);
    private Barista barista = new Barista();

    public void menu() {

        String menu = """
                =================
                커피주문 프로그램
                =================
                1. 아메리카노
                2. 라떼
                0. 종료
                =================
                선택 : """;
        while(true) {
            System.out.println(menu); // 메뉴출력
            String choice = sc.next(); // 선택하기
            Order order = null;

            switch (choice) {
                case "1" :
                    order = createOrder("아메리카노");
                    break;
                case "2" :
                    order = createOrder("라떼");
                    break;
                case "0" : return;
                default:
                    System.out.println("> 잘못입력하셨습니다.");
            }

            // 주문 요청 / 취소
            if(order != null) {
                sendCoffeeRequest(order);
            } else {
                System.out.println("> 주문을 취소했습니다.");
            }
        }
    }

    private void sendCoffeeRequest(Order order) {

        Coffee[] coffees = barista.makeCoffee(order);
        System.out.println("> 주문하신 " + Arrays.toString(coffees) + "가 나왔습니다.");
    }

    private Order createOrder(String menuName) {

        String option = inputOption();
        int count = inputCount();

        // 주문 생성
        Order order = new Order(menuName, option, count);
        // 주문 확인
        boolean confirmed = confirmOrder(order);
        return confirmed? order : null;
    }

    private boolean confirmOrder(Order order) {

        System.out.print("""
                > 주문 내역을 확인하세요.
                ===========================
                메뉴명 : %s
                옵션 : %s
                수량 : %d
                ===========================
                > 주문처리 1. 승인 2. 취소
                입력 : """.formatted(order.getMenuName(), order.getOption(), order.getCount()));
        return sc.next().equals("1");
    }

    private int inputCount() {

        System.out.print("> 수량을 입력하세요 : ");
        return sc.nextInt();
    }

    private String inputOption() {
        System.out.print("> 옵션을 선택하세요 1. HOT, 2. ICE : ");

        return sc.next().equals("1") ? "HOT" : "ICE";
    }
}
