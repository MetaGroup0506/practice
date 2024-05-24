package com.ohgiraffers.meta;

public class School extends Object {

    private String name;

    public School() {
        System.out.println("School의 기본생성자 호출됨");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String myMethod() { return "내꺼";}
}
