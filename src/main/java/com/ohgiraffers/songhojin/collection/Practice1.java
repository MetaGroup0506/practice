package com.ohgiraffers.songhojin.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice1 {
    public static void main(String[] args) {
        /*
         * 다음 데이터를 처리할 Customer 클래스를 설계하고
         * 아래의 요구사항을 구현하세요.
         *
         * ### 출력 예시 ###
         * ==========================================
         * 이름     나이   성별   포인트
         * ==========================================
         * 홍길동    25    남    1250.5
         * 박문수    33    남    3457.8
         * 김춘추    38    남    2485.6
         * 신사임당  43    여    2300.9
         * ==========================================
         *
         * 1. collection.Customer <- 클래스 생성
         * 2. collection.Practice1 <- 메인 호출용
         *
         * [요구사항]
         * 1. 위 표에 제시한 순서대로 데이터를 List에 추가하기.
         * 2. 위 리스트에 다음 데이터를 맨 앞에 추가하기.
         * ------------------------------------------
         * 이황     66    남     9999.9
         * ------------------------------------------
         * 3. 고객 이름을 가나다순으로 정렬해서 출력하기.
         * 4. 나이를 오름차순으로 정렬해서 출력하기.
         */

        List<Customer> customers = new ArrayList<>();

        // 1. 표에 제시된 순서대로 데이터를 List에 추가
        customers.add(new Customer("홍길동", 25, "남", 1250.5));
        customers.add(new Customer("박문수", 33, "남", 3457.8));
        customers.add(new Customer("김춘추", 38, "남", 2485.6));
        customers.add(new Customer("신사임당", 43, "여", 2300.9));

        // 2. 새로운 데이터를 맨 앞에 추가
        customers.add(0, new Customer("이황", 66, "남", 9999.9));

        // 3. 고객 이름 가나다순으로 정렬해서 출력
        Collections.sort(customers, Comparator.comparing(Customer::getName));
        System.out.println("고객 이름 가나다순 정렬:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        // 4. 나이 오름차순으로 정렬해서 출력
        Collections.sort(customers, Comparator.comparingInt(Customer::getAge));
        System.out.println("나이 오름차순 정렬:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
