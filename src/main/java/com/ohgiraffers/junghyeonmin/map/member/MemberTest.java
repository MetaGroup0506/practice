package com.ohgiraffers.junghyeonmin.map.member;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MemberTest {
    Map<String, Member> map = new HashMap<>();
    public MemberTest() {
        map.put("honggd", new Member("honggd", "1234", "홍길동", 35, "01012341234"));
        map.put("sinsa", new Member("sinsa", "1234", "신사임당", 50, "01012341234"));
        map.put("yooon", new Member("yooon", "1234", "윤봉길", 37, "01012341234"));
        map.put("jangbg", new Member("jangbg", "1234", "장보고", 29, "01012341234"));
    }

    public void test1() { // 회원 정보 전체 출력
        System.out.println("==================================================");
        System.out.println("아이디\t비밀번호\t이름\t    나이\t전화번호");
        System.out.println("==================================================");

        for (Map.Entry<String, Member> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

        System.out.println("==================================================");
    }

    public void test2() {
        System.out.println("jangbg : " + isUserExist("jangbg"));
        System.out.println("sejong : " + isUserExist("sejong"));
    }

    private boolean isUserExist(String userId) {
        return map.containsKey(userId);
    }

    public void test3() {
        if (isUserExist("yooon")) {
            map.put("yooon", new Member("yooon", "5678", "윤동주", 27, "01034563456"));
        }
        System.out.println(map.get("yooon"));
    }

    public void test4() {
        if (isUserExist("sinsa")) {
            map.remove("sinsa");
        }
        System.out.println("sinsa : " + isUserExist("sinsa"));
    }
}