package com.ohgiraffers.limsuyeon;

public class Application2 {
    public static void main(String[] args) {
        /* 계산기 프로그래밍 */
        checkMethod();

        // 두 수의 합 계산 메서드(sumTwoNumber(int num1, int num2)) 호출
        sumTwoNumber(10, 20);

        // 두 수의 곱 계산 메서드(multiTwoNumber(int num1, int num2)) 호출
        multiTwoNumber(10, 20);
    }

    // 반환값 : void
    // 메서드명 : checkMethod
    // 호출하면 "메서드 호출 확인"을 출력하는 기능의 메서드
    public static void checkMethod() {
        System.out.println("메서드 호출 확인");
    }

    // 반환값 : String
    // 메소드명 : sumTwoNumber
    // 두개의 전달인자를 받아 두수의 합을 반환
    // 출력의 내용은 "10과 20의 합은 30입니다." 라는 문장을
    // 출력하는 기능
    public static String sumTwoNumber(int num1, int num2) {
        int sum = num1 + num2;
        String result = num1 + "과 " + num2 + "의 합은 " + sum + "입니다.";
        System.out.println(result);
        return result;
    }

    // 반환값 : int
    // 메소드명 : multiTwoNumber
    // 두개의 전달인자를 받아 두수의 곱을 반환
    // 출력의 내용은 "10과 20의 곱은 200입니다." 라는 문장을
    // 출력하는 기능
    public static void multiTwoNumber(int num1, int num2) {
        int multiply = num1 * num2;
        System.out.println(num1 + "과 " + num2 + "의 곱은 " + multiply + "입니다.");
    }
}
