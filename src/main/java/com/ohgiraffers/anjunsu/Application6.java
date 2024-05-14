package com.ohgiraffers.anjunsu;

import java.util.Scanner;

public class Application6 {

    public static void main(String[] args) {

        /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1******
         */

        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        char[] idNumber = new char[14];
        for (int i = 0; i < 14; i++) {
            idNumber[i] = number.charAt(i);
        }

        for (int i = 7; i < 14; i++) {
            idNumber[i] = '*';
        }

        for (int i = 0; i < 14; i++) {
            System.out.print(idNumber[i]);
        }

    }
}
