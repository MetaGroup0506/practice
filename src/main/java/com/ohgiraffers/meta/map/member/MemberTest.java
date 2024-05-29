package com.ohgiraffers.meta.map.member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberTest {

    private Map<String, Member> member = null;

    public MemberTest() {
        /*   honggd	1234	홍길동	35	01012341234
        *   sinsa	1234	신사임당	50	01012341234
        *   leess	1234	이순신	43	01012341234
        *   yooon	1234	윤봉길	37	01012341234
        *   jangbg	1234	장보고	29	01012341234
         */
        member = new HashMap<>();
        member.put("honggd", new Member("honggd", "1234", "홍길동", 35, "01012341234"));
        member.put("sinsa", new Member("sinsa", "1234", "신사임당", 50, "01012341234"));
        member.put("leess", new Member("leess", "1234", "이순신", 43, "01012341234"));
        member.put("yooon", new Member("yooon", "1234", "윤봉길", 37, "01012341234"));
        member.put("jangbg", new Member("jangbg", "1234", "장보고", 29, "01012341234"));
    }

    public void test1() {

        System.out.println("=========================================================================================");
        System.out.println();
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%n","id", "password", "name", "age", "phone");
        System.out.println("=========================================================================================");
        Collection<Member> members = member.values();
        for(Member m : members) {
            System.out.printf("%-15s%-15s%-15s%-15d%-15s%n",m.getUserId(), m.getUserPwd(), m.getUserName(), m.getAge(), m.getPhoneNumber());
        }
        System.out.println("=========================================================================================");
    }
}
