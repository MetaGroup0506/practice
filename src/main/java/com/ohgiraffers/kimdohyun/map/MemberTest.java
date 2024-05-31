package com.ohgiraffers.kimdohyun.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 *   MemberTest.java
 *   Author : syamcat
 *   Created : 24. 5. 29.
 **/
public class MemberTest {
    Map<String, Member> members = new HashMap<>();

    public void test1() {
        Collection<Member> values = members.values();
        for (Member member : values) {
            System.out.println(member);
        }
    }

    public void putMember(Member member) {
        members.put(member.getUserId(), member);
    }
}
