package com.ohgiraffers.meta.pfinal.exception;

public class Application1 {

    public static void main(String[] args) {

        /*
        * 문제1.
        * countAlpha()메소드를 이용하여 전달된 문자열값에서 영문자가 몇개인지 카운트해서 리턴
        * 단, 공백문자가 있으면, CharCheckException 발생
        *
        * 에러메세지 : 체크할 문자열 안에 공백 포함할 수 없습니다.
        *
        * */

        /*
        * 문제2.
        * checkDouble() 메소드를 이용하여 임의의 정수를 두 개 전달받아, 첫번재 수가 두번째 수의 배수인지 확인
        * 배수가 맞으면 true를 리턴하고, 아니면 false를 리턴
        * 단, 전달된 첫번째와 두번째 수가 1~100 사이의 값이 아니면
        * NumberRangeException 발생
        *
        * 출력메세지 : ooo의 배수이다/배수가 아니다.
        * 에러메세지 : 1부터 100 사이의 값이 아닙니다.
        * */
    }

    public int countAlpha(String s) {

        return 0;
    }

    public boolean checkDouble(int a, int b){

        return false;
    }
}
