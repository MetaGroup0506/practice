package com.ohgiraffers.leeminjae.map;

import com.ohgiraffers.leeminjae.map.member.MemberTest;

public class Application {
    public static void main(String[] args) {
        MemberTest memberTest = new MemberTest();

        System.out.println("[요구사항 1] Map의 모든 member 객체 출력");
        memberTest.test1();
        System.out.println("\n[요구사항 2] 특정 회원(아이디)의 존재 여부 확인(boolean)");
        memberTest.test2();
        System.out.println("\n[요구사항 3] 특정 회원의 객체 수정");
        memberTest.test3();
        System.out.println("\n[요구사항 4] 특정 회원의 객체 삭제");
        memberTest.test4();
    }
}
