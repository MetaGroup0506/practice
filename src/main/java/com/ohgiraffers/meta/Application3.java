package com.ohgiraffers.meta;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

       String result = rockPaperScissors();
        System.out.println("result = " + result);

        Application3 app3 = new Application3();
        String result2 = app3.printNumber();
        System.out.println(result2);
    }

    /*
    * static 메소드로 생성
    * 반환형 : String
    * 메소드명 : rockPaperScissors
    *
    * 가위 바위 보 중 하나를 출력
    * (가위, 바위, 보 는 난수를 이용하여 구현)
    *
    * -- 출력 --
    * 가위
    * */
    public static String rockPaperScissors(){

        int random = (int)(Math.random() * 3);
        System.out.println("random = " + random);
        String result = (random == 0)? "가위" : (random == 1)? "바위": "보"; // 삼항연산자를 이용할때

        if(random == 0) {   // if문을 이용할 때
            result = "가위";
        }

        if(random == 1) {
            result = "바위";
        }

        if(random == 2) {
            result = "보";
        }

        return result;
    }

    /*
        반환형 : String
        메소드명 : printNumber
        사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
        단, 입력한 수는 1보다 크거나 같아야 합니다.
        만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

        ex.
        1이상의 숫자를 입력하세요 : 4			1 이상의 숫자를 입력하세요 : 0
        1 2 3 4 					            1 이상의 숫자를 입력해주세요.

    * */

    public String printNumber(){

        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int inputNumber = sc.nextInt();

        String result = "";
        if(inputNumber >= 1){
            for(int i = 0; i < inputNumber; i++) {
                result += (i + 1) + " ";
            }
        } else {
            result = "1 이상의 숫자를 입력해주세요.";
        }

        return result;
    }
}
