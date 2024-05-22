package com.ohgiraffers.meta.member;

public class Application {

    public static void main(String[] args) {

        System.out.println();



        // 객체생성
        MemberDTO member = new MemberDTO();
        member.getAge(); // 재사용해야할경우 주소값을

        new MemberDTO().setAge(10);

        MemberDTO member2 = new MemberDTO();
        System.out.println(member2.getId());
        System.out.println(member2.getName());
        System.out.println(member2.getAge());
        System.out.println(member2.getPwd());

        member2.setAge(10);
        System.out.println("=======> " + member2.getAge());

        MemberDTO memberDTO = new MemberDTO("user01", "pass01", "홍길동");
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
