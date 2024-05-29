package com.ohgiraffers.limsuyeon;

import java.util.Scanner;

public class Application6 {
    public static void main(String[] args) {
        /*
         * 주민등록번호를 Scanner로 입력받고 이를 문자 배열로 저장한 뒤
         * 성별 자리 이후부터 '*'로 가려서 출력.
         *
         * -- 입력 예시 --
         * # 주민등록번호를 입력하세요: 990101-1234567
         *
         * -- 출력 예시 --
         * # 출력 결과: 990101-1******
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("# 주민등록번호를 입력하세요: ");
        String personalNumber = scanner.nextLine();

        char[] pnChars = personalNumber.toCharArray();

        for (int i = 0; i < pnChars.length; i++) {
            if (i < 8) {
                continue;
            }
            pnChars[i] = '*';
        }
//        System.out.println("! pnChars: " + Arrays.toString(pnChars)); // ! pnChars: [9, 9, 0, 1, 0, 1, -, 1, *, *, *, *, *, *]

        String result = new String(pnChars);
        System.out.println("# 출력 결과: " + result);
    }
}
