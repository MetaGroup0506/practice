package com.ohgiraffers.soyeonlim.collection;

public class Customer {
    private String name;
    private int age;
    private String gender;
    private Double point;

    public Customer(String name, int age, String gender, Double point) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.point = point;
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

    public Double getPoint() {
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