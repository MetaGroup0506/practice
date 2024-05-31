package com.ohgiraffers.kimdohyun.map;

/*
 *   Member.java
 *   Author : syamcat
 *   Created : 24. 5. 29.
 **/
public class Member {
    private String userId;
    private String userPwd;
    private String userName;
    private int age;
    private String phoneNumber;

    public Member(String userId, String userPwd, String userName, int age, String phoneNumber) {
        this.userId = userId;
        this.userPwd = userPwd;
        this.userName = userName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getUserId() {
        return userId;
    }
    public String getUserPwd() {
        return userPwd;
    }
    public String getUserName() {
        return userName;
    }
    public int getAge() {
        return age;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "[" + userId + "|" + userPwd + "|" + userName + "|" + age + "]";
    }
}
