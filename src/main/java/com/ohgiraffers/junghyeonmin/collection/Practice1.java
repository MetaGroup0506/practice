package com.ohgiraffers.junghyeonmin.collection;

import java.util.*;

import static java.util.Arrays.compare;

public class Practice1 {

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

        // ArrayList 생성
        List<Customer> customers = new ArrayList();


        // 1. 데이터 추가
        customers.add(new Customer("홍길동", 25, "남", 1250.5));
        customers.add(new Customer("박문수", 33, "남", 3457.8));
        customers.add(new Customer("김춘추", 38, "남", 2485.6));
        customers.add(new Customer("신사임당", 43, "여", 2300.9));

        // 2. 이황 데이터 맨앞에 추가
        customers.add(0, new Customer("이황", 66, "남", 9999.9));

        // 확인
        System.out.println("\n=============리스트============");
        getList(customers);

        // 3. 고객 이름 가나다순으로 정렬해서 출력
        System.out.println("\n=============이름============");
        sortName(customers);

        // 4. 나이 오름차순으로 정렬해서 출력
        System.out.println("\n=============나이============");
        sortAge(customers);
    }

    // 리스트 출력
    private static void getList(List<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    // 나이 오름차순 정렬
    private static void sortAge(List<Customer> customers) {
        customers.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (o1.getAge() == o2.getAge()) {
                    return 0;
                }
                return o1.getAge() > o2.getAge() ? 1 : -1;
            }
        });

        getList(customers);
    }

    // 이름 사전순 정렬
    private static void sortName(List<Customer> customers) {
        customers.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        getList(customers);
    }
}
