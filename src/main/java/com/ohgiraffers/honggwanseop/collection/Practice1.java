package com.ohgiraffers.honggwanseop.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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

        List<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer("홍길동",25,"남",1250.5));
        customerList.add(new Customer("박문수",33,"남",3457.8));
        customerList.add(new Customer("김춘추",38, "남", 2485.6));
        customerList.add(new Customer("신사임당",43,"여",2300.9));

        customerList.addFirst(new Customer("이황",66,"남", 9999.9));

        System.out.println("====== 이름순으로 출력 ======");
        customerList.sort(Comparator.comparing(Customer::getName));
        for (Customer customer: customerList){
            System.out.println(customer);
        }

        System.out.println("====== 나이순으로 출력 ======");
        customerList.sort(Comparator.comparing(Customer::getAge));
        for (Customer customer: customerList){
            System.out.println(customer);
        }
    }
}
