package com.ohgiraffers.leedongryeol;

public class Sample {

    public static void main(String[] args) { // 메인메소드 (프로그램의 처음 실행)

        printMessage("안녕하세요");
        String print = printAge(20);
        System.out.println(print);

        String test = "helloworld";
        char ch = test.charAt(3);
        System.out.println("ch = " + ch);
        char ch2 = test.charAt(4);
        System.out.println("ch2 = " + ch2);

        String personId = "881122-2234567";
        char id = personId.charAt(7);
        System.out.println("id = " + id);
        // 주민등록번호를 입력받아서 남자인지 여자인지 확인해주세요
        // 881122-1234567
        // 881122-2234567
        // 001122-3
        // 001122-4








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
