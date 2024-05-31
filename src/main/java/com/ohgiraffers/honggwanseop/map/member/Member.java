package com.ohgiraffers.honggwanseop.map.member;

public class Member {
    private String userID;
    private String userPwd;
    private String userName;

    private int age;
    private String phoneNumber;

    public Member(String userID, String userPwd, String userName, int age, String phoneNumber) {
        this.userID = userID;
        this.userPwd = userPwd;
        this.userName = userName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }


    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
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
        return "Member{" +
                "userID='" + userID + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
