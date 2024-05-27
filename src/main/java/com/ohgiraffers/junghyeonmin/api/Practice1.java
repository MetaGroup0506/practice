package com.ohgiraffers.junghyeonmin.api;

public class Practice1 {

    public static void main(String[] args) {

        Practice1 sp = new Practice1();
        String result = sp.preChar("hello world");
        System.out.println(result);

        Practice1 p1 = new Practice1();
        int num = p1.charSu("application car cable", 'c');
        System.out.println(num);
    }

    // +preChar(String s) :String :> 문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드 작성
    private String preChar(String s) {
        if (s == null || s.isEmpty()) { // 문자열이 비어 있거나 null이면 그대로 반환
            return s;
        }

        // 문자열만 이용 - 첫번째 단어만 대문자로 변환 후 뒤의 문자열과 변합
        return s.substring(0, 1).toUpperCase() + s.substring(1);

        // char 타입을 이용
//        // 첫번째 글짜를 추출 후 대문자로 변경
//        char firstWord = s.charAt(0);
//        // 대문자로 변경
//        firstWord -= 32;
//        // 다시 병합
//        return firstWord + s.substring(1);

    }


    // +charSu(String s, char ch):int :> 문자열에서 찾는 문자가 몇 개 포함되어 있는지 반환하는 메서드 작성
    private int charSu(String s, char cg) {
        if (s == null || s.isEmpty()) { // 문자열이 비어 있거나 null이면 그대로 반환
            return -1;
        }

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == cg) {
                count++;
            }
        }
        return count;
    }

    // 출력예시
    /*
     *    Hello world
     *    3
     * */
}