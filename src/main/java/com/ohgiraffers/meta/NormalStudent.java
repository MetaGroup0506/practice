package com.ohgiraffers.meta;

public class NormalStudent extends Student {

    private String name;

    public NormalStudent() {
    }

    public NormalStudent(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
