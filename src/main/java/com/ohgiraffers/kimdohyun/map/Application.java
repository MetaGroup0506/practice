package com.ohgiraffers.kimdohyun.map;

public class Application {

    public static void main(String[] args) {

        /*
         * com.ohgiraffers.이름.member.Member
         * 필드(변수)
         * - userId: String	// 유저 ID
         * - userPwd: String	// 유저 Password
         * - userName: String	// 유저 이름
         * - age: int	       // 유저 나이
         * - phoneNumber: String	// 유저 폰번호
         *
         * 메소드
         *   getter/ setter
         *   생성자
         *
         * 1. 다음 회원 정보를 Map<String, Member> 에 저장후, 출력하세요.
         *       1. 회원 Map은 필드로 지정하고, MemberTest 생성자에서 map에 요소 추가할 것.
         *       2. 메소드 com.ohgiraffers.이름.member.MemberTest.test1()
         *           - map의 모든 member객체 정보 출력
         *       3. 출력예시
         *   ==================================================
         *   아이디	비밀번호	이름	나이	전화번호
         *   ==================================================
         *   honggd	1234	홍길동	35	01012341234
         *   sinsa	1234	신사임당	50	01012341234
         *   leess	1234	이순신	43	01012341234
         *   yooon	1234	윤봉길	37	01012341234
         *   jangbg	1234	장보고	29	01012341234
         *   ==================================================
         * */

        MemberTest memberTest = new MemberTest();

        memberTest.putMember(new Member("honggd", "1234", "홍길동", 35, "01012341234"));
        memberTest.putMember(new Member("sinsa", "1234", "신사임당", 50, "01012341234"));
        memberTest.putMember(new Member("leess", "1234", "이순신", 43, "01012341234"));
        memberTest.putMember(new Member("yooon", "1234", "윤봉길", 37, "01012341234"));
        memberTest.putMember(new Member("jangbg", "1234", "장보고", 29, "01012341234"));

        memberTest.test1();
    }
}
