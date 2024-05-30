package com.ohgiraffers.youngkue.map.member;

import java.util.HashMap;
import java.util.Map;

public class MemberTest {

    private static final Map<String, Member> map = new HashMap<>();


    public MemberTest(){
        map.put("honggd", new Member("honggd","1234","홍길동",35,"01012341234"));
        map.put("sinsa", new Member("sinsa",	"1234",	"신사임당",	50, "01012341234"));
        map.put("leess", new Member("leess",	"1234",	"이순신",	43, "01012341234"));
        map.put("yooon", new Member("yooon",	"1234",	"윤봉길",	37, "01012341234"));
        map.put("jangbg", new Member("jangbg",	"1234",	"장보고",	29, "01012341234"));
    }

    public void memberPrint(Member member){
        System.out.printf(
                "%-15s%-15s%-15s%-15d%-15s%n",
                member.getUserId(),
                member.getUserPwd(),
                member.getUserName(),
                member.getAge(),
                member.getPhoneNumber());
    }

    public void memberPrintTitle(){
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%n", "아이디", "비밀번호", "이름", "나이", "전화번호");
    }

    public void membersPrint(){
        map.forEach((key, value) -> memberPrint(value));
    }

    public void test1(){
        memberPrintTitle();
        membersPrint();
    }

    public boolean isUserExist(String userId){
        return map.containsKey(userId);
    }

    public void test2() {
        System.out.println("jangbg: " + isUserExist("jangbg"));
        System.out.println("sejong: " + isUserExist("sejong"));
    }

    public void test3() {
        String updateKey = "yooon";
        if (!isUserExist(updateKey)) {
            System.out.println(updateKey + "은 없는 회원입니다");
            return;
        }
        Member node = map.get(updateKey);
        System.out.println("=== 변경 전 "+ updateKey +" 회원 정보 ===");
        memberPrint(node);
        node.setUserPwd("5678");
        node.setUserName("윤동주");
        node.setAge(27);
        node.setPhoneNumber("01034563456");
        System.out.println("=== 변경 후 "+ updateKey +" 회원 정보 ===");
        memberPrint(node);
    }

    public void test4() {
        String removeKey = "sinsa";
        if (!isUserExist(removeKey)) {
            System.out.println(removeKey + "는 없는 회원입니다");
            return;
        }
        System.out.println("=== 변경 전 전체 회원 목록 === ");
        membersPrint();
        map.remove(removeKey);
        System.out.println("=== 변경 후 전체 회원 목록 === ");
        membersPrint();
    }
}
