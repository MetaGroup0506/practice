package com.ohgiraffers.leeminjae.pfinal.exception;

public class Application1 {

    public static void main(String[] args) {
        Application1 app = new Application1();

        System.out.println("[문제 1] 예외 발생");
        try {
            int result = app.countAlpha("Kamil Lee"); // 공백 포함 테스트
            System.out.println("총 영문자의 수: " + result);
        } catch (CharCheckException e) {
            System.out.println(e.getMessage());
        }

        try {
            int result = app.countAlpha("KamilLee"); // 공백 불포함 테스트(정상 작동)
            System.out.println("총 영문자의 수: " + result);
        } catch (CharCheckException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n[문제 2] 예외 발생");
        try {
            boolean result = app.checkDouble(10, 150); // 범위에 벗어난 수 테스트
            System.out.println(result ? "10은 150의 배수이다." : "10은 150의 배수가 아니다.");
        } catch (NumberRangeException e) {
            System.out.println(e.getMessage());
        }

        try {
            boolean result = app.checkDouble(50, 5); // 정상 작동
            System.out.println(result ? "50은 5의 배수이다." : "50은 5의 배수가 아니다.");
        } catch (NumberRangeException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * ### 문제 1 ###
     * countAlpha() 메서드를 이용해서 전달된 문자열값에서
     * 영문자가 몇 개인지 카운트하기.
     *
     * 단, 공백문자가 있으면 CharCheckException 발생시키기!
     *   - 에러메세지 : 체크할 문자열 안에 공백 포함할 수 없습니다.
     */
    public int countAlpha(String s) throws CharCheckException {
        if (s.contains(" ")) {
            throw new CharCheckException("\033[31m체크할 문자열 안에 공백을 포함할 수 없습니다.\033[0m");
        }
        int count = 0;

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }

        return count; // 총 영문자의 수
    }

    /**
     * ### 문제 2 ###
     * checkDouble() 메서드를 이용해서 임의의 정수를 두 개 전달받아,
     * 첫 번째 수가 두 번째 수의 배수인지 확인하기.
     *
     * 단, 전달된 첫 번째와 두 번째 수가 1~100 사이의 값이 아니면
     * NumberRangeException 발생시키기!
     *   - 출력메세지 : ooo의 배수이다/배수가 아니다.
     *   - 에러메세지 : 1부터 100 사이의 값이 아닙니다.
     */
    public boolean checkDouble(int a, int b) {
        if (a < 1 || a > 100 || b < 1 || b > 100) {
            throw new NumberRangeException("\033[31m1부터 100 사이의 값이 아닙니다.\033[0m");
        }

        return a % b == 0; // 배수 체크
    }
}
