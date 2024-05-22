package com.ohgiraffers.junghyeonmin;

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

        // 0~7자리까지 복사후 새로운 문자열에 넣고 뒤에 ****** 추가하기

        Scanner stdIn = new Scanner(System.in);

        System.out.print("주민등록번호를 입력하세요 : ");
        String str = stdIn.nextLine();

        String str2 = str.substring(0, 8) + "******"; // substring(a,b) a~b까지의 문자열을 반환함
        System.out.println(str2);
    }
}
