package com.ohgiraffers.juhyeon;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        /* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
         * 검색할 문자를 하나 입력 받아
         * 입력 받은 검색할 문자가 문자열에 몇개 있는지를 출력하세요
         *
         * -- 입력 예시 --
         * 문자열을 하나 입력하세요 : helloworld
         *
         * -- 출력 예시 --
         * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 하나 입력하세요: ");
        String str = sc.nextLine();

        System.out.print("검색할 문자를 하나 입력하세요: ");
        char ch = sc.next().charAt(0);

        char[] charArr = str.toCharArray();

        int count = 0;
        for (char c : charArr) {
            if (c == ch) {
                count++;
            }
        }
        System.out.printf("입력하신 문자열 %s에서 찾으시는 문자 %c는 %d개 입니다.", str, ch, count);
    }
}
