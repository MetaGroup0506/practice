package com.ohgiraffers.leeminjae.collection;

public class Customer {
    private final String name;
    private final int age;
    private final String gender;
    private final double point;

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

    public String getGender() {
        return gender;
    }

    public double getPoint() {
        return point;
    }
}
