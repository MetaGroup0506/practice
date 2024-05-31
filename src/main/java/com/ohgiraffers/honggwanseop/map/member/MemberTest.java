package com.ohgiraffers.honggwanseop.map.member;

import java.util.HashMap;
import java.util.Map;

public class MemberTest {
    private Map<String, Member> member=null;

    public MemberTest() {
        member =new HashMap<>();

        member.put("honggd", new Member("honggd", "1234", "홍길동", 35, "01012341234"));
        member.put("sinsa", new Member("sinsa", "1234", "홍길동", 50, "01012341234"));
        member.put("leess", new Member("leess", "1234", "홍길동", 43, "01012341234"));
        member.put("yooon", new Member("yooon", "1234", "윤봉길", 37, "01012341234"));
        member.put("jangbg", new Member("jangbg", "1234", "홍길동", 29, "01012341234"));
    }

    public boolean isUserExist(String userID){
        return member.containsKey(userID);
    }

    public void test1(){
        System.out.println("========================================");
        System.out.printf("%-15s%-15s%-15s  %-15s%-15s%n","id","password","name","age","phone");

        for (Member m: member.values()){
            System.out.printf("%-15s%-15s%-15s%-15s%-15s%n",m.getUserID(),m.getUserPwd(),m.getUserName()
                    ,m.getAge(),m.getPhoneNumber());
        }
        System.out.println("========================================");
    }

    public void test2(){
        String [] testIDs={"jangbg","sejong"};
        for (String testID: testIDs){
            System.out.println(testID + " : " + isUserExist(testID));
        }
        System.out.println();
    }

    public void test3(){
        String modifyID="yooon";
        if (isUserExist(modifyID)){
            System.out.println("id가 "+ modifyID + "인 회원 아이디 정보 수정");
            Member target = member.get(modifyID);
            target.setAge(27);
            target.setPhoneNumber("01034563456");
            target.setUserName("윤동주");

            System.out.println("수정된 회원 정보: " + target);
        } else{
                System.out.println("존재하지 않는 아이디");
        }
        System.out.println();
    }

    public void test4(){
        String removeID="sinsa";
        if (isUserExist(removeID)){
            System.out.println(removeID + " 회원정보 삭제");
            member.remove(removeID);
        } else{
            System.out.println("존재하지 않는 아이디");
        }
        System.out.println();
    }
}
