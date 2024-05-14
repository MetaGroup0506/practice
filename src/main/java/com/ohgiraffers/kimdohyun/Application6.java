package com.ohgiraffers.kimdohyun;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호를 입력하세요 :");
        String input = sc.nextLine();
        char[] idNumbers = new char[13];
        String result = "";
        int idx = 0;
        boolean flag = false;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                if (idx > 12) {
                    System.out.println("숫자의 갯수를 정확하게 입력해주세요.");
                    return ;
                }
                idNumbers[idx] = input.charAt(i);
                idx++;
            } else if (input.charAt(i) == '-') {
                flag = true;
                continue;
            } else {
                System.out.println("숫자 및 하이픈(-)만 입력해주세요.");
                return ;
            }
        }

        if (flag != true) {
            System.out.println("000000-0000000 형식으로 입력해주세요.");
            return ;
        }

        idx = 0;
        for (char c : idNumbers) {
            if (idx < 7) {
                result += idNumbers[idx];
                if (idx == 5) {
                    result += '-';
                }
            } else {
                result += '*';
            }
            idx++;
        }
        System.out.println(result);
    }
}
