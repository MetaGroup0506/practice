package com.ohgiraffers.meta;

import com.ohgiraffers.meta.member.MemberDTO;

public class Sample2 {

    public static void main(String[] args) {

//        new Sample2().test1();
        Student student = new Student();
//        student.getName();
        // student --> 타입이 뭐에요??????? Student, School, Object

//        System.out.println(student instanceof  Student);
//        System.out.println(student instanceof  School);
//        System.out.println(student instanceof Object);
//
//        // 1번
//        if(student instanceof  Student) {
//            System.out.println("1");
//        } else if(student instanceof  School) {
//            System.out.println("1");
//        } else if(student instanceof Object) {
//            System.out.println("1");
//        }
//        // 2번
//        if(student instanceof Object) {
//            System.out.println("1");
//        } else if(student instanceof  School) {
//            System.out.println("1");
//        } else if(student instanceof  Student) {
//            System.out.println("1");
//        }
    }


    public void test1() {

        int[][] iarr = new int[3][5];

        for(int i = 0; i < iarr.length; i++) { // iarr.length -> 3

            for(int j = 0; j < iarr[i].length; j++) { // iarr[0].length -> 5

            }
        }

        MemberDTO[] members = new MemberDTO[4];

        for(int i = 0; i < members.length; i++) {

            if(i != 2)
                members[i] = new MemberDTO();

        }
        System.out.println("==============================");
        for(int i = 0; i < members.length; i++) {
            if(members[i] != null){
                System.out.println(members[i].getInformation());
            } else {
                System.out.println("회원 정보가 없습니다.");
            }
        }


    }
}
