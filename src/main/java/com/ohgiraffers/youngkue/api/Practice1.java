package com.ohgiraffers.youngkue.api;

import java.util.Objects;

public class Practice1 {

    // 출력예시
    /*
     *
     *    Hello world
     *    3
     * */

    // +preChar(String s) :String :> 문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드 작성
    public String preChar(String s){
        if (Objects.isNull(s) || s.isEmpty()) return  s;

        return s.toUpperCase().charAt(0) + s.substring(1);
    }

    // +charSu(String s, char ch):int :> 문자열에서 찾는 문자가 몇 개 포함되어 있는지 반환하는 메서드 작성
    public int charSu(String s, char ch){
        if (Objects.isNull(s)) return  0;

        int cnt = 0;
        for (int i = 0; i < s.length(); i++)  {
            if (s.charAt(i) == ch) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Practice1 p1 = new Practice1();
        String result = p1.preChar("hello world");
        System.out.println(result);

        int num = p1.charSu("application car cable", 'c');
        System.out.println(num);
    }
}
