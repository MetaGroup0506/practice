package com.ohgiraffers.kimdohyun.api;

public class Practice1 {

    public static void main(String[] args) {

        Practice1 p1 = new Practice1();
        String result = p1.preChar("hello world");
        System.out.println(result);

        int num = p1.charSu("application car cable", 'c');
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
    public String preChar(String s) {
        StringBuilder result = new StringBuilder();

        if (s == null || s.isEmpty())   // null Guard
            return s;

        if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
            result.append((char)(s.charAt(0) - 32));
            if (s.length() == 1)
                return result.toString();
            for (int i = 1; i < s.length(); i++) {
                result.append(s.charAt(i));
            }
        }
        else
            return s;

        return result.toString();
    }

    public int charSu(String s, char ch) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }
}
