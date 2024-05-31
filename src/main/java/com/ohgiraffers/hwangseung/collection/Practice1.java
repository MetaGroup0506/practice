package com.ohgiraffers.hwangseung.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Practice1 {

    private ArrayList<Customer> list = new ArrayList<>();

    public static void main(String[] args) {

        /*
        * 다음 데이터를 처리할 Customer클래스를 설계하고 아래의 요구사항을 구현하세요.
        * =============================================================
        * 이름	   나이	 성별	포인트
        * =============================================================
        * 홍길동	25	  남	1250.5
        * 박문수	33	  남	3457.8
        * 김춘추	38	  남	2485.6
        * 신사임당	43	  여	2300.9
        * =============================================================
        * com.ohgiraffers.성함.collection.Customer <- 데이터를 담을 클래스를 생성
        * com.ohgiraffers.성함.collection.Practice1 <- 실행용클래스
        *
        *
        * [요구사항]
        * 1. 위 표에 제시한 순서대로 데이터를 List에 추가하세요.
        * 2. 위 리스트에 다음 데이터를 맨앞에 추가하세요.
        * ----------------------------------------------------------
        * 이황 66 남 9999.9
        * ----------------------------------------------------------
        * 3. 고객 이름 가나다순으로 정렬해서 출력하세요.
        * 4. 나이 오름차순으로 정렬해서 출력하세요.
        * */
        Practice1 p1 = new Practice1();
        System.out.println();
        System.out.println("==========================test(1)=============================");
        p1.test1();
        System.out.println("==========================test(2)=============================");
        p1.test2();
        System.out.println("==========================test(3)=============================");
        p1.test3();
        System.out.println("==========================test(4)=============================");
        p1.test4();
    }

    public void test1() {
        list.add(new Customer("홍길동", 25, '남', 1250.5));
        list.add(new Customer("박문수", 33, '남', 3457.8));
        list.add(new Customer("김춘추", 38, '남', 248.5));
        list.add(new Customer("신사임당", 43, '여', 2300.9));

        System.out.println(list);
    }

    public void test2() {
        list.add(0, new Customer("이황", 66, '남', 9999.9));
        System.out.println(list);
    }

    public void test3() {

        list.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {

                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(list);
    }

    public void test4() {

        list.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(list);
    }
}
