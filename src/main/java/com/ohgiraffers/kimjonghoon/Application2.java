package com.ohgiraffers.kimjonghoon;

public class Application2 {

    public static void main(String[] args) {

        /* 계산기 프로그래밍 */
        checkMethod();


    }


    // 반환값 : void
    // 메소드명 : checkMethod
    // 호출하면 "메소드 호출 확인"을 출력하는 기능의 메소드
    public static void checkMethod() {
        System.out.println("메소드 호출 확인");
        //String result = sumTwoNumber(10, 20);
        //System.out.println(result);
        System.out.println(sumTwoNumber(10, 20));

        int num1 = 10;
        int num2 = 20;
        int result = multiTwoNumber(num1 ,num2);
        System.out.println( num1 + "과 " + num2 + "의 곱은" + result + "입니다.");
    }

    // 반환값 : String
    // 메소드명 : sumTwoNumber
    // 두개의 전달인자를 받아 두수의 합을 반환
    // 출력의 내용은 "10과 20의 합은 30입니다." 라는 문장을
    // 출력하는 기능
    public static String sumTwoNumber(int num1, int num2) {
        /*
        * sumTwoNumber(10, 20)
        *  num1 = 10  or num1 = 20
        *   return num1 + "과 " + num2 + "의 합은 " + (num1+num2) + "입니다.";
        *
        * sumTwoNumber(20, 10)
        *  num2 = 20  or num = 10
        *   return num2 + "과1 " + num1 + "의 합은 " + (num2+num1) + "입니다.";
        *
        * */
        int sum = num1 + num2;

        return num1 + "과 " + num2 + "의 합은 " + sum + "입니다.";
        //return "10과 20의 합은 30입니다.";
    }

    // 반환값 : int
    // 메소드명 : multiTwoNumber
    // 두개의 전달인자를 받아 두수의 곱을 반환
    // 출력의 내용은 "10과 20의 곱은 200입니다." 라는 문장을
    // 출력하는 기능
    public static int multiTwoNumber(int num1, int num2) {
        return num1 * num2;
    }
}