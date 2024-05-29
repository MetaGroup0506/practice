package com.ohgiraffers.leeminjae.map.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberTest {
    private final Map<String, Member> memberMap = new HashMap<>();

    public MemberTest() {
        memberMap.put("honggd", new Member("honggd", "1234", "홍길동", 35, "01012341234"));
        memberMap.put("sinsa", new Member("sinsa", "1234", "신사임당", 50, "01012341234"));
        memberMap.put("ieess", new Member("ieess", "1234", "이순신", 43, "01012341234"));
        memberMap.put("yooon", new Member("yooon", "1234", "윤봉길", 37, "01012341234"));
        memberMap.put("jangbg", new Member("jangbg", "1234", "장보고", 29, "01012341234"));
    }

    public boolean isUserExist(String userId) {
        Member member = memberMap.get(userId);
        return member != null;
    }

    public void printMemberList() {
        List<Member> members = new ArrayList<>(memberMap.values());

        String print = """
                =============================================
                아이디  |  비밀번호  |  이름  |  나이  |  전화번호
                =============================================
                """;
        System.out.print(print);

        for (Member member : members) {
            System.out.println(member);
        }
    }

    public void test1() {
        printMemberList();
    }

    public void test2() {
        System.out.println("userId == jangbg : " + isUserExist("jangbg"));
        System.out.println("userId == sejong : " + isUserExist("sejong"));
    }

    public void test3() {
        Member idYoon = memberMap.get("yooon");

        System.out.println("Before = " + idYoon);

        idYoon.setUserPwd("5678");
        idYoon.setUserName("윤동주");
        idYoon.setAge(27);
        idYoon.setPhoneNumber("01034563456");

        System.out.println("After = " + idYoon);
    }

    public void test4() {
        memberMap.remove("sinsa");
        printMemberList();
    }
}
