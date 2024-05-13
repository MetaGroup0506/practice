package com.ohgiraffers.younyeowon;

import java.util.Scanner;

public class Application5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 하나 입력하세요 : ");
        String inputString = scanner.nextLine();
        
        char[] charArray = inputString.toCharArray();
        
        System.out.print("찾으시는 문자를 입력하세요 : ");
        char searchChar = scanner.nextLine().charAt(0);
        
        int count = 0;
        for (char ch : charArray) {
            if (ch == searchChar) {
                count++;
            }
        }
        
        System.out.printf("입력하신 문자열 %s에서 찾으시는 문자 %c은 %d개 입니다.", inputString, searchChar, count);
        
        scanner.close();
    }
}