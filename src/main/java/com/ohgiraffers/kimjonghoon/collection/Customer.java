package com.ohgiraffers.kimjonghoon.collection;

import java.util.ArrayList;
import java.util.Comparator;

public class Customer implements Comparator<Customer> {
    private String name;
    private int age;
    private char gender;
    private double point;

    public Customer() {};
    public Customer(String name, int age, char gender, double point) {
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
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
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", point=" + point +
                '}';
    }

    @Override
    public int compare(Customer o1, Customer o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
