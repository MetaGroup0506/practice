package com.ohgiraffers.leechanwoo;

public class Application2 {

    public static void main(String[] args) {

        /* 계산기 프로그래밍 */
        checkMethod();
        System.out.println(sumTwoNumber(10, 20));
        System.out.println("10과 20의 곱은 "+ multiTwoNumber(10, 20)+"입니다.");
    }


    // 반환값 : void
    // 메소드명 : checkMethod
    // 호출하면 "메소드 호출 확인"을 출력하는 기능의 메소드
    public static void checkMethod() {
        System.out.println("메소드 호출 확인");
    }


    // 반환값 : String
    // 메소드명 : sumTwoNumber
    // 두개의 전달인자를 받아 두수의 합을 반환
    // 출력의 내용은 "10과 20의 합은 30입니다." 라는 문장을
    // 출력하는 기능
    public static String sumTwoNumber(int a, int b){ // 두개의 정수 전달인자 선언

        int result = (a+b); // 두수의 합 수행

        return "10과 20의 합은 "+ result +"입니다."; // 반환 값

    }

    // 반환값 : int
    // 메소드명 : multiTwoNumber
    // 두개의 전달인자를 받아 두수의 곱을 반환
    // 출력의 내용은 "10과 20의 곱은 200입니다." 라는 문장을
    // 출력하는 기능

    public static int multiTwoNumber(int i, int j){
        int result2 = (i*j); // 두수의 곱 수행

        return result2;
    }
}