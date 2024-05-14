package com.ohgiraffers.parkjinhee;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {
        System.out.println(rockPaperScissors());
        System.out.println(printNumber());
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
        String[] choices = {"가위", "바위", "보"};
        int randomIndex = (int) (Math.random() * 3);
        return choices[randomIndex];
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
    public static String printNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하세요: ");
        int N = sc.nextInt();

        if (N < 1) {
            return "1 이상의 숫자를 입력해주세요.";
        } else {
            StringBuilder result = new StringBuilder();
            for (int i = 1; i <= N; i++) {
                result.append(i).append(" ");
            }
            return result.toString().trim();
        }
    }
}
