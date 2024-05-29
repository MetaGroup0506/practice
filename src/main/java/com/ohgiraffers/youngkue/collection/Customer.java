package com.ohgiraffers.youngkue.collection;

public class Customer {
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

    public int getAge() {
        return age;
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
