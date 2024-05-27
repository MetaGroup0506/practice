package com.ohgiraffers.soyeonlim.api;

public class Practice1 {

    public static void main(String[] args) {

        Practice1 p1 = new Practice1();
        String result = p1.preChar("hello world");
        System.out.println(result);

        int num = p1.charSu("eeny, meeny, miny, moe", 'e');
        System.out.println(num);
    }

    // +preChar(String s) :String :> 문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드 작성
    // +charSu(String s, char ch):int :> 문자열에서 찾는 문자가 몇 개 포함되어 있는지 반환하는 메서드 작성

    // 출력예시
    /*
     *
     *    Hello world
     *    3
     * */
    public static String preChar(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    public static int charSu(String s, char ch) {
        if (s == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
