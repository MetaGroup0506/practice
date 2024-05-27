package com.ohgiraffers.junghyeonmin.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Customer<E> {
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

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", point=" + point +
                '}';
    }
}
