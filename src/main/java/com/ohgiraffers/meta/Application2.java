package com.ohgiraffers.meta;

public class Application2 {

    public static void main(String[] args) {

        /* 계산기 프로그래밍 */
        checkMethod();
        sumTwoNumber(10, 20);
        multiTwoNumber(10, 20);
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
        int c = a + b;
        String str = a + " 과 " + b + " 의 합은 " + c + " 입니다.";

        System.out.println(str);

        return str;

    }


    // 반환값 : int
    // 메소드명 : multiTwoNumber
    // 두개의 전달인자를 받아 두수의 곱을 반환
    // 출력의 내용은 "10과 20의 곱은 200입니다." 라는 문장을
    // 출력하는 기능
    public static String multiTwoNumber(int num1, int num2){
        int num3 = num1 * num2;
        String str2 = num1 + " 과 " + num2 + " 의 곱은 " + num3 +" 입니다. ";

        System.out.println(str2);

        return str2;

    }



}
