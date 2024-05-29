package com.ohgiraffers.honggwanseop.collection;

public class Customer {

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

    private String name;
    private int age;

    private String gender;

    private double point;


    public Customer(String name, int age, String gender, double point) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.point = point;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return name + "\t" + age + "\t" + gender + "\t" + point;
    }
}
