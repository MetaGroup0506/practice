package com.ohgiraffers.meta;

import java.util.Random;
import java.util.Scanner;

public class ImportTest {

    public static void main(String[] args) {

        double random = Math.random();
        System.out.println(random);
        // 0~ 9 : 10
        int random1 = (int) (Math.random() * 10);
        System.out.println("random1 = " + random1);
        // 0.0 * 10 <= 난수 < 1.0 * 10
        //  (int)0 + 1 <= 난수 < (int)10 + 1
        // 1 <= 난수 < 11

        // 1 ~ 10
        int random2 = (int) (Math.random() * 10) + 1;
        System.out.println("random2 = " + random2);

        // 10 ~ 15
        int random3 = (int)(Math.random() * 6) + 10;
        System.out.println("random3 = " + random3);

        Random random4 = new Random();
        int randomNum = random4.nextInt(10) + 1; // 0~9 , 1~ 10
        System.out.println("randomNum = " + randomNum);
    }
    public static void sum(int first, int second){
        System.out.println(first + " 와 " + second + "의 합은 " + (first + second) + "입니다.");
    }

    public void testForExample() {

        Scanner sc = new Scanner(System.in);

//        System.out.print("1번째 학생의 이름을 입력해주세요 : ");
//        String student1 = sc.nextLine();
//        System.out.println("1 번째 학생의 이름은 " + student1 + "입니다.");
//
//        System.out.print("2번째 학생의 이름을 입력해주세요 : ");
//        String student2 = sc.nextLine();
//        System.out.println("2 번째 학생의 이름은 " + student2 + "입니다.");
//
//        System.out.print("3번째 학생의 이름을 입력해주세요 : ");
//        String student3 = sc.nextLine();
//        System.out.println("3 번째 학생의 이름은 " + student3 + "입니다.");
//
//        System.out.print("4번째 학생의 이름을 입력해주세요 : ");
//        String student4 = sc.nextLine();
//        System.out.println("4 번째 학생의 이름은 " + student4 + "입니다.");
//
//        System.out.print("5번째 학생의 이름을 입력해주세요 : ");
//        String student5 = sc.nextLine();
//        System.out.println("15 번째 학생의 이름은 " + student5 + "입니다.");
//
//        System.out.print("6번째 학생의 이름을 입력해주세요 : ");
//        String student6 = sc.nextLine();
//        System.out.println("16 번째 학생의 이름은 " + student6 + "입니다.");
//
//        System.out.print("7번째 학생의 이름을 입력해주세요 : ");
//        String student7 = sc.nextLine();
//        System.out.println("7 번째 학생의 이름은 " + student7 + "입니다.");
//
//        System.out.print("8번째 학생의 이름을 입력해주세요 : ");
//        String student8 = sc.nextLine();
//        System.out.println("8 번째 학생의 이름은 " + student8 + "입니다.");
//
//        System.out.print("9번째 학생의 이름을 입력해주세요 : ");
//        String student9 = sc.nextLine();
//        System.out.println("9 번째 학생의 이름은 " + student9 + "입니다.");
//
//        System.out.print("10번째 학생의 이름을 입력해주세요 : ");
//        String student10 = sc.nextLine();
//        System.out.println("10 번째 학생의 이름은 " + student10 + "입니다.");
//

        /*
        * 반복할 내용
        * 1. 안내문구 출력
        * 2. 학생 이름을 입력받아 변수에 저장
        * 3. 저장한 이름을 출력
        * 반복횟수 : 총 10번 , 0 or 1
        * */
        for(int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println((i + 1) + " 번째 학생의 이름은 " + student + "입니다.");
        }

        for(int i = 1; i <= 10; i++) {
            System.out.print(i + "번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i + " 번째 학생의 이름은 " + student + "입니다.");
        }


    }

    /***
     * 매개변수로 배열을 받아서 출력하는 메소드
     * @param iarr 출력하기위한 배열
     */
    public void printArray(int[] iarr) {

        System.out.println("iarr의 hashCode는 " + iarr.hashCode());
        iarr[0] = 100;
        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
    }

    public String[] returnString(){

        String[] sarr = {"a", "p", "p", "l", "e"};

        System.out.println("sarr.hashCode() = " + sarr.hashCode());

        return sarr;
    }
    
    public int[] printArrayMethod(int[] iarr) {

        System.out.println(">>> iarr의 hashCode는 " + iarr.hashCode());
        
        int[] iarr2 = new int[10]; // -> 새로운 주소값 생성
        System.out.println(">>> iarr2.hashCode() = " + iarr2.hashCode());
        for(int i = 0; i < iarr.length; i++) {
            iarr2[i] = iarr[i];
        }
        
        return iarr2;
    }
}
