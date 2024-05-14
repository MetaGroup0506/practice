package com.ohgiraffers.kimdohyun;

import java.util.Arrays;
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
        System.out.println("문자열을 하나 입력하세요 : ");
        String word = sc.nextLine();
        System.out.println("찾으려는 문자를 입력하세요 : ");
        char target = sc.next().charAt(0);
        char[] alpah  = new char[word.length()];
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            alpah[i] = word.charAt(i);
        }

        for (char c : alpah) {
            if (c == target) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("찾으시는 문자는 문자열에 존재하지 않습니다.");
            return ;
        }
        System.out.println("입력하신 문자열 " + word + "에서 찾으시는 문자 " + target + "은 " + count + "개 있습니다.");
    }
}
