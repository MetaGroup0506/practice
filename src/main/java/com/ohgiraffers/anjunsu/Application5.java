package com.ohgiraffers.anjunsu;

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

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String str = scanner.nextLine();
        char toChar = str.charAt(0);

        char[] array = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            array[i] = word.charAt(i);
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toChar) {
                count ++;
            }
        }
        System.out.println("입력하신 문자열 "+ word + "에서 찾으시는 문자 "+ str +"은 " + count + "개 입니다.");
    }
}
