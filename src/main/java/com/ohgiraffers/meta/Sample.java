package com.ohgiraffers.meta;

public class Sample {

    public static void main(String[] args) { // 메인메소드 (프로그램의 처음 실행)

        printMessage("안녕하세요");
        String print = printAge(20);
        System.out.println(print);
    }

    /***
     * 입력받은 값을 출력하는 용도의 메소드
     * @param message 메세지
     */
    public static void printMessage(String message) { // 반환해줄게 없다.
        System.out.println(message);
    }

     public static String printAge(int age) {
 // 접근제한자 키워드     반환타입    메소드명(매개변수)
        String result = "입력하신 나이는 " + age + "세 입니다.";

        return result; // 어떤 타입으로 선언해야할까???????
    }
}
