package com.ohgiraffers.meta;

public class OhgiraffersStudent extends Student {

    private String name;

    public OhgiraffersStudent() {
    }

    public OhgiraffersStudent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" +
                this.toString() +
                " name='" + name + '\'' +
                ']';
    }
}
