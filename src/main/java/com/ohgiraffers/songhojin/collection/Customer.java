package com.ohgiraffers.songhojin.collection;

public class Customer {
    private String name;
    private int age;
    private String gender;
    private double points;

    public Customer(String name, int age, String gender, double points) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.points = points;
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

    public double getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', age=" + age + ", gender='" + gender + "', points=" + points + "}";
    }
}
