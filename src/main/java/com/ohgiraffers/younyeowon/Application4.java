package com.ohgiraffers.younyeowon;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        String[] fruits = {"딸기", "바나나", "복숭아", "키위", "사과"};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("0부터 4까지의 정수를 입력하세요 : ");
        int index = scanner.nextInt();
        
        if (index >= 0 && index < fruits.length) {
            System.out.println(fruits[index]);
        } else {
            System.out.println("준비된 과일이 없습니다.");
        }
        
        scanner.close();
    }
}