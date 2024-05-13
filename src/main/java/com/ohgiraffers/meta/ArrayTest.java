package com.ohgiraffers.meta;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        /*
        * 1. 같은 자료형끼리의 묶음
        * 2. 배열은 선언시에는 항상 방의 크기를 지정해야한다.
        * 3. 인덱스가 있어서 반복문을 사용할 수 있다.
        * */

        int[] iarr = new int[4];   // new int[4] -> 배열의 주소값
        System.out.println("iarr = " + iarr);

//        System.out.println(iarr[0]);
//        System.out.println(iarr[1]);
//        System.out.println(iarr[2]);
//        System.out.println(iarr[3]);

        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
        // 문자열의 길이를 알고싶어요~ : length() 메소드를 이용해서사용
        String str = "helloworld";
        System.out.println(str.length());

        /*
        * hashCode()
        *
        * 동일객체 : 값도 같고, 주소값도 같은 경우 동일객체
        * 동등객체 : 값은 같고, 주소값은 다른 경우 동등객체
        * */
        ImportTest importTest = new ImportTest();
        System.out.println("ArrayTest 클래스의 iarr의 hashCode : " + iarr.hashCode());
        importTest.printArray(iarr);

        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }

        String[] result = importTest.returnString();
        System.out.println("result.hashCode() = " + result.hashCode());

        int[] returnIarr = importTest.printArrayMethod(iarr);
        System.out.println(">>> returnIarr.hashCode() = " + returnIarr.hashCode());
        for(int i = 0; i < returnIarr.length; i++) {
            System.out.print(returnIarr[i] + " ");
        }
        System.out.println("=====================================================");
        int[] testArr1 = {1, 2, 3, 4};
        int[] copyArr1 = testArr1.clone();

        testArr1[0] = 100;

        for(int i = 0; i < testArr1.length; i++) {
            System.out.print(testArr1[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < copyArr1.length; i++) {
            System.out.print(copyArr1[i] + " ");
        }

        /* 향상된 for문
           int[] iarr = new int[4];
        */
        System.out.println();
        for(int i : testArr1) {
            System.out.println(i);
        }

//        for(int i : testArr1) {
//            i += 10; // i = i + 10
//        }
        for(int i = 0; i < testArr1.length; i++) {
            testArr1[i] += 10;
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for(int i : testArr1) {
            System.out.println(i);
        }

        /*
        * 향상된 for문은 배열에 인덱스에 차례로 접근할 때는 편하게 사용할 수 있지만
        * 값을 변경할 수는 없다.
        * */

        /*
        * int[] iarr = {1, 2, 3, 4}; ---> int[] copyArr = new int[10] 에 값을 복사하고싶다.
        * 배열의 복사 방법
        * 1. for문이용
        * 2. clone()
        * 3. arraycopy (System클래스)
        * 4. copyOf()
        * */
        System.out.println("---------------------------------");
//        int[] copyTestArr1 = new int[10];
//        System.arraycopy(testArr1, 0, copyTestArr1, 0, testArr1.length);
        int[] copyTestArr2 = Arrays.copyOf(testArr1, 10);
        for(int i : copyTestArr2) {
            System.out.println(i);
        }


    }
}
