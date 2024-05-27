package com.ohgiraffers.meta.api;

public class Practice1 {

    public static void main(String[] args) {

        Practice1 p1 = new Practice1();
        String result = p1.preChar("hello world");
        System.out.println(result);

        int num = p1.charSu("application car cable", 'c');
        System.out.println(num);
    }

    // +preChar(String s) :String :> 문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드 작성
    public String preChar(String s) {

//        char[] carr1 = new char[s.length()];
//        for(int i = 0; i < s.length(); i++) {
//            carr1[i] = s.charAt(i);
//        }

//        char[] carr = s.toCharArray();
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }
    // +charSu(String s, char ch):int :> 문자열에서 찾는 문자가 몇 개 포함되어 있는지 반환하는 메서드 작성
    public int charSu(String s, char ch) {

        char[] cStr = s.toCharArray();
        int cnt = 0; // 갯수 체크용
        for(int i = 0; i < cStr.length; i++) {
            if(cStr[i] == ch){
                cnt++;
            }
        }
        return cnt;
    }
    // 출력예시
    /*
    *
    *    Hello world
    *    3
    * */
}
