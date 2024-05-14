package com.ohgiraffers.younyeowon;

import java.util.Scanner;

public class Application6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하세요 : ");
        String idNumber = scanner.nextLine();
        
        char[] idArray = idNumber.toCharArray();
        
        for (int i = 8; i < idArray.length; i++) {
            idArray[i] = '*';
        }
        
        String maskedId = new String(idArray);
        System.out.println(maskedId);
        
        scanner.close();
    }
}