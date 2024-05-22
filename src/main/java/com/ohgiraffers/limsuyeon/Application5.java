package com.ohgiraffers.limsuyeon;

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
        System.out.print("문자열을 하나 입력하세요 : ");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        char search = sc.next().charAt(0);
        int cnt = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == search) {cnt++;}
        }
        System.out.println("입력하신 문자열 " + s + "에서 찾으시는 문자 " + search + "은 " + cnt + "개 입니다.");
    }
}
