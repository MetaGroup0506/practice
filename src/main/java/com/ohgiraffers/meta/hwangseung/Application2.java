package com.ohgiraffers.meta.hwangseung;

public class Application2 {

    public static void main(String[] args) {

        System.out.println(sumTwoNumber(10, 20));

        System.out.println("10과 20의 곱은 " + multiTwoNumber(10, 20) + "입니다.");
    }

    public static String sumTwoNumber(int num1, int num2) {

        int sum = num1 + num2;
        return num1 + "과 " + num2 + "의 합은 " + sum + "입니다.";
    }

    public static int multiTwoNumber(int num1, int num2) {

        int num3 = num1 * num2;
        return num3;
    }
}
