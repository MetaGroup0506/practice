package com.ohgiraffers.junghyeonmin.map.member;

import java.util.Objects;

public class Member {
    private String userId;
    private String userPwd;
    private String userName;

    private int age;

    private String phoneNumber;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Member(String userId, String userPwd, String userName, int age, String phoneNumber) {
        this.userId = userId;
        this.userPwd = userPwd;
        this.userName = userName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return userPwd + "\t" + userName + "\t" + age + "\t" + phoneNumber;
    }
}
