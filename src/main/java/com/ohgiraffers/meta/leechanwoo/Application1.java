package com.ohgiraffers.meta.leechanwoo;

public class Application1 {

    public static void main(String[] args) {

        /* 정수형 변수 2개를 선언하여  각 20과 30으로 초기화 한 후
         * 두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 다음과 같이 출력하세요
         *
         * -- 출력 예시 --
         * 더하기 결과  : 50
         * 빼기 결과 : -10
         * 곱하기 결과 : 600
         * 나누기한 몫 : 0
         * 나누기한 나머지 : 20
         * */
        int a=20;
        int b=30;
        int result;

        result = a+b;
        System.out.println("A + B 더하기 결과 :"+result);

        result = a-b;
        System.out.println("A - B 빼기 결과 :"+ result);

        result = a*b;
        System.out.println("A * B 곱하기 결과 : "+ result);

        result = a/b;
        System.out.println("A / B 나누기한 몫 : "+ result);

        result = a%b;
        System.out.println("A % B 나누기한 나머지 : "+ result);
    }
}
