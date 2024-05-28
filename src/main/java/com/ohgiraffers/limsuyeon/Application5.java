package com.ohgiraffers.limsuyeon;

import java.util.Scanner;

public class Application5 {
    public static void main(String[] args) {
        /*
         * 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
         * 검색할 문자를 하나 입력 받아
         * 입력 받은 검색할 문자가 문자열에 몇 개 있는지를 출력.
         *
         * -- 입력 예시 --
         * # 문자열을 하나 입력하세요: helloworld
         * # 검색할 문자를 입력하세요: l
         *
         * -- 출력 예시 --
         * # 입력하신 문자열 'helloworld'에서 찾으시는 문자 'l'은(는) 3개 입니다.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("# 문자열을 하나 입력하세요: ");
        String word = scanner.nextLine();

        System.out.print("# 검색할 문자를 입력하세요: ");
        String alphabet = scanner.nextLine();

        char[] chars = word.toCharArray();
        int count = 0;

        for (char ch : chars) {
            if (ch == alphabet.charAt(0)) {
                count++;
            }
        }

        System.out.println("# 입력하신 문자열 '" + word + "'에서 찾으시는 문자 '" + alphabet + "'은(는) " + count + "개 입니다.");
    }
}
