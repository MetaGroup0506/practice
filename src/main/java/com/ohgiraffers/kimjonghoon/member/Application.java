package com.ohgiraffers.kimjonghoon.member;

import com.ohgiraffers.meta.member.MemberDTO;

public class Application {

    public static void main(String[] args) {

        System.out.println();



        // 객체생성
        com.ohgiraffers.meta.member.MemberDTO member = new com.ohgiraffers.meta.member.MemberDTO();
        member.getAge(); // 재사용해야할경우 주소값을

        new com.ohgiraffers.meta.member.MemberDTO().setAge(10);

        com.ohgiraffers.meta.member.MemberDTO member2 = new com.ohgiraffers.meta.member.MemberDTO();
        System.out.println(member2.getId());
        System.out.println(member2.getName());
        System.out.println(member2.getAge());
        System.out.println(member2.getPwd());

        member2.setAge(10);
        System.out.println("=======> " + member2.getAge());

        com.ohgiraffers.meta.member.MemberDTO memberDTO = new MemberDTO("user01", "pass01", "홍길동");
        System.out.println(memberDTO.getInformation());



    }


    public void testMethod(String str, String... memberDTOS) {


    }


//    public MemberDTO getNewMember() {
//
////        int i;
////        System.out.println("i = " + i);
////        return new MemberDTO();
//
//    }

    public void bestMethod(int i) {
        System.out.println(i);
    }

    public void bestMethod(String s) {

    }
}
