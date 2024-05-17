package com.ohgiraffers.junghyeonmin;

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

        countWord();
    }

    private static void countWord() { // 원하는 문자가 몇 개 있는지 찾는 메서드
        Scanner stdIn = new Scanner(System.in);

        System.out.print("문자열을 하나 입력하세요 : ");
        String str = stdIn.nextLine();

        char[] arr = new char[str.length()]; // 문자형 배열
        arr = transType(str, arr); // 문자열을 문자형 배열로 변환

        System.out.print("찾으려는 문자를 입력해주세요 : ");
        char word = stdIn.nextLine().charAt(0);

        System.out.println("입력하신 문자열 " + str + "에서 찾으시는 문자 " + word + "는 " + count(word, arr) + "개입니다.");
    }

    private static char[] transType(String str, char[] arr) { // 문자열 -> 문자형 배열 변환 메서드
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    private static int count(char word, char[] arr) { // 원하는 단어가 총 몇 개인지 확인하는 메서드
        int count = 0;
        for (char c : arr) {
            if (c == word) {
                count++;
            }
        }
        return count;
    }

}
