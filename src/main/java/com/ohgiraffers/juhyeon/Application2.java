package com.ohgiraffers.juhyeon;

public class Application2 {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        // Application2 app = new Application2();
        /* 계산기 프로그래밍 */
        checkMethod();

        // 문제 풀어보기
        System.out.println(sumTwoNumber(a, b));
        System.out.println(a  + "과(와) " + b + "의 곱은 " + multiTwoNumber(a, b) + "입니다.");

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
    public static String sumTwoNumber(int a, int b) {
        int sum = a + b;
        String result = a  + "와 " + b + "의 합은 " + sum + "입니다.";
        return result;
    }

    // 반환값 : int
    // 메소드명 : multiTwoNumber
    // 두개의 전달인자를 받아 두수의 곱을 반환
    // 출력의 내용은 "10과 20의 곱은 200입니다." 라는 문장을
    // 출력하는 기능

    public static int multiTwoNumber(int a, int b) {
        int multi = a * b;
        return multi;
    }
}
