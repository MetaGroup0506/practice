package com.ohgiraffers.meta;

import java.awt.event.MouseAdapter;

public class Student { // Student의 부모 Object

    private String name;
    private int score;

    public final double PI = 3.14;

    public Student() {
        super();
        System.out.println("기본생성자 호출");
    }


    public int sumScore() {
        return 0;
    }

    public double avgScore() {
        return 0.0;
    }

    public void goToSchool(){

    }
    
    @Override
    public String toString() {
        return "[" +
                "name : '" + name + '\'' +
                ", score : " + score +
                ", PI :  " + PI +
                ']';
    }
}
