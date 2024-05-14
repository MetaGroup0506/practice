package com.ohgiraffers.anjunsu;

import java.util.Random;
import java.util.Scanner;

public class ImportTest {

    public static void main(String[] args) {

        double random = Math.random();
        System.out.println(random);

        // 0 ~ 9 : 10
        int random1 = (int/* double에서 int로 형 변환 */)(Math.random()*10);
        System.out.println("random1 = " + random1);

        // 0.0 * 10 <= 난수 < 1.0 * 10
        // (int)0 + 1 <= 난수 < (int)10 + 1
        // 1 <= 난수 < 11

        // 1 ~ 10
        int random2 = (int)(Math.random() * 10) + 1;
        System.out.println("random2 = " + random2);

        // 10 ~ 15
        int random3 = (int)(Math.random() * 6) + 10;
        System.out.println("random3 = " + random3);

        Random random4 = new Random();
        int randomNum = random4.nextInt(10) + 1; // 0 ~ 9, 1 ~ 10
        System.out.println("randomNum = " + randomNum);

    }

    public static void sum(int first, int second) {
        System.out.println(first + "와 " + second + "의 합은 " + (first + second) + "입니다.");
    }


    public void testForExample() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 번째 학생의 이름을 입력해주세요 : ");
        String student1 = sc.nextLine();
        System.out.println("1 번째 학생의 이름은 " + student1 + "입니다.");

        /*
        반복할 내용
        1. 안내문구 출력
        2. 학생 이름을 입력받아 변수에 저장
        3. 저장한 이름을 반복
        반복 횟수 : 총 10번, 0 or 1
         */

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println((i + 1) + "번째 학생의 이름은" + student + "입니다.");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i + "번째 학생의 이름은" + student + "입니다.");
        }
    }
}
