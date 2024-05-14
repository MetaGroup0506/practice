package com.ohgiraffers.kimjonghoon;

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
        System.out.print("문자열 하나를 입력해주세요. : ");
        String text = sc.next();
        char[] carr = new char[text.length()];

        //System.out.println(text.length());
        for(int i = 0; i < text.length(); i++) {
            carr[i] += text.charAt(i);
        }

        System.out.print("찾으려는 문자를 입력해주세요. : ");

        char searchText = sc.next().charAt(0);

        int resultNum = 0;

        for(int i = 0; i < carr.length; i++){
            if(carr[i] == searchText) {
                resultNum++;
            }
        }

        if(resultNum == 0){
            System.out.println("일치하는 문자가 없습니다.");
        } else {
            System.out.println(resultNum);
        }
    }
}
