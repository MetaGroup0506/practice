package com.ohgiraffers.leeminjae;

import java.util.Random;
import java.util.Scanner;

public class Application3 {
    /**
     * static 메서드로 생성
     * 반환명 : String
     * 메서드명: rockPaperScissors
     *
     * 가위 / 바위 / 보 중 하나를 출력
     * (가위, 바위, 보는 난수를 이용하여 구현)
     *
     * -- 출력 예시--
     * # 출력 결과: 가위
     */
    public static String rockPaperScissors() {
        String[] rcp = {"가위", "바위", "보"};
        Random random = new Random();

        int index = random.nextInt(3);
        return rcp[index];
    }

    /**
     * static 메서드로 생성
     * 반환형 : String
     * 메서드명 : printNumber
     *
     * 시용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력.
     * 단, 입력한 수는 1보다 크거나 같아야 함.
     * 만일, 1 미만의 숫자가 입력되었다면 "1 이상의 숫자를 입력해 주세요."를 출력.
     *
     * -- 출력 예시 --
     * # 1 이상의 숫자를 입력하세요 : 4
     * # 출력 결과: 1 2 3 4
     *
     * # 1 이상의 숫자를 입력하세요 : 0
     * # 출력 결과: 1 이상의 숫자를 입력해 주세요.
     */
    public static String printNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n"+ "# 1 이상의 숫자를 입력하세요: ");
        int num = scanner.nextInt();

        if(num < 1) {
            return "1 이상의 숫자를 입력해 주세요.";
        }

        StringBuilder result = new StringBuilder();
        for(int i = 1; i <= num; i++) {
            result.append(i).append(" ");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String randomRCP = rockPaperScissors();
        System.out.println("# 출력 결과: " + randomRCP);

        String printNum = printNumber();
        System.out.println("# 출력 결과: " + printNum);
    }
}