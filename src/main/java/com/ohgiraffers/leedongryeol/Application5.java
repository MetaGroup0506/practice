package com.ohgiraffers.leedongryeol;

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
         Scanner sc2 = new Scanner(System.in);

         System.err.println("문자열을 하나 입력하세요 : ");
         String str = sc.nextLine();

         char[] ch = str.toCharArray();

         System.err.println("찾을 문자를 입력하세요.");
         char ch2 = sc.nextLine().charAt(0);

         int a = 0;

         for (int i = 0; i< str.length(); i++){

            if(ch[i] == ch2){
                a++;

            }
         }


         System.err.println("입력하신 문자열 " + str + " 에서 찾으신 문자는 " + ch2 + " 은 " + a +" 개 입니다.");
    }
}
