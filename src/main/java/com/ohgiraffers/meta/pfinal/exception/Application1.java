package com.ohgiraffers.meta.pfinal.exception;

import com.ohgiraffers.meta.exceptionTest.Application;
import com.ohgiraffers.meta.exceptionTest.CharCheckException;
import com.ohgiraffers.meta.exceptionTest.NumberRangeException;

import java.util.Scanner;

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
        Application1 app1 = new Application1();
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");

//        String s = sc.nextLine();
//        System.out.println(app1.countAlpha(s));

        try {
            String s = sc.nextLine();

            System.out.println(app1.countAlpha(s));

        } catch(CharCheckException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램을 종료합니다.");
    }

    public int countAlpha(String s) {

        // String내에 검사문자열이 존재하지 않으면 -1을 리턴
        if(s.indexOf(" ") > -1){
            throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
        }

        int cnt = 0;
        for(int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i)) || Character.isLowerCase(s.charAt(i))){
                cnt++;
            }
        }

        return cnt;
    }

    public boolean checkDouble(int a, int b){

        if (!((a > 0 && a <= 100) && (b > 0 && b <= 100)))
            throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");

        // a가 b의 배수인 경우
        if (a % b == 0)
            return true;
        else
            return false;
    }
}
