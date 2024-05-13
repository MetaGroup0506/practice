package com.ohgiraffers.songhojin;

public class Sample {
    public static void main(String[] args) {
        printMessage("안녕하세요");
        String print = printAge(20);
        System.out.println(print);
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }

    public static String printAge(int age) {
        String result = "입력하신 나이는 " + age + "입니다.";
        return result;
    }
}
