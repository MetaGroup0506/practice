package com.ohgiraffers.parkinseong;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        /* 길이가 5인 String 배열을 선언하고
         * "딸기", "바나나", "복숭아", "키위", "사과" 로 초기화를 하고
         * 스캐너로 0부터 4까지의 정수를 입력 받아
         * 해당 정수의 인덱스에 있는 과일을 출력하세요
         *
         * 단, 배열의 인덱스 범위를 벗어나는 경우 "준비된 과일이 없습니다." 를 출력하세요
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 2
         *
         * -- 출력 예시 --
         * 복숭아
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 준비된 과일이 없습니다.
         * */
        Scanner sc = new Scanner(System.in);
        String arr[] = {"딸기","바나나","복숭아","키위","사과"};
        System.out.print("0부터 4까지의 정수를 입력하세요 : ");
        int input = sc.nextInt();
        if (input < 0 || input >= arr.length) {
            System.out.println("준비된 과일이 없습니다.");
        } else System.out.println(arr[input]);

    }
}
