package com.ohgiraffers.juhyeon;

import java.util.Random;
import java.util.Scanner;
public class Application3 {

    public static void main(String[] args) {

        System.out.println(rockPaperScissors());

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int number = sc.nextInt();
        printNumber(number);

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

    public static String rockPaperScissors() {
        Random random = new Random();
        int choice = random.nextInt(3);
        System.out.println("random: " + choice);

        String str = "";
        switch(choice) {
            case 0 -> str = "가위";
            case 1 -> str = "바위";
            case 2 -> str = "보";
            default -> str = "알 수 없음";
        }
        return str;
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

    public static void printNumber(int number) {
        if(number < 1) {
            System.out.println("1 이상의 숫자를 입력해주세요.");
            return;
        }

        for(int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }

    }
}
