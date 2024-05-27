package com.ohgiraffers.leeminjae.api;

public class Practice1 {

    // *preChar(String s) : String ->
    // 문자열을 넘겨받아, 첫글자를 대문자로 변경하는 메서드 작성
    private String preChar(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

    // *charSu(String, char ch) : int ->
    // 문자열에서 찾는 문자가 몇 개 포함되어 있는지 반환하는 메서드 작성
    private int charSu(String s, char ch) {
        int count = 0;

        if (s == null || s.isEmpty()) {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Practice1 p1 = new Practice1();

        String result1 = p1.preChar("hello world");
        String result2 = p1.preChar("kamil lee");
        System.out.println(result1); // Hello world
        System.out.println(result2); // Kamil lee

        int num1 = p1.charSu("application car cable", 'c');
        int num2 = p1.charSu("pneumonoconiosis", 'o');
        System.out.println(num1); // 3
        System.out.println(num2); // 4
    }
}