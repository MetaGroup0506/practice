package com.ohgiraffers.songhojin;

import java.util.Random;
import java.util.Scanner;

public class ImportTest {
    public static void main(String[] args) {
        double random = Math.random();
        System.out.println(random);
        int random1 = (int) (Math.random() * 10);
        System.out.println("random1: " + random1);

        int random2 = (int) (Math.random() * 10) + 1;
        System.out.println("random2: " + random2);

        int random3 = (int) (Math.random() * 6) + 10;
        System.out.println("random3: " + random3);

        Random random4 = new Random();
        int randomNum = random4.nextInt(10) + 1;
        System.out.println("randomNum: " + randomNum);
    }

    public void testForExample() {
        Scanner sc = new Scanner(System.in);

//        System.out.println("1번째 학생의 이름을 입력해주세요 : ");
//        String student1 = sc.nextLine();
//        System.out.println("student1  = " + student1 + "입니다.");

        for (int i=0; i<10; i++) {
            System.out.println((i + 1) + "번째 학생의 이름을 입력해주세요 :");
            String student = sc.nextLine();
            System.out.println((i + 1) + " 번째 학생의 이름은 " + student + "입니다");
        }
    }
}
