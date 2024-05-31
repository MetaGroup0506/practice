package com.ohgiraffers.junghyeonmin.map.member;

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
         *
         * 2. Map에 저장된 회원 중 인자로 전달할 아이디가 존재하는 여부를 검사하는 메소드를 생성하세요.
         *    검사 메소드 : com.ohgiraffers.이름.map.member.MemberTest.isUserExist(userId:String):boolean
         *    요구사항 :
         *       com.ohgiraffers.이름.map.member.MemberTest.test2()에서 다음 두 아이디를 테스트하세요.
         *       - jangbg : true 리턴
         *       - sejong : false 리턴
         *
         * 3. yooon 아이디 조회 후 해당 객체를 다음과 같이 수정하세요.
         *    메소드 : com.ohgiraffers.이름.map.member.MemberTest.test3()
         *
         *        비밀번호 : 5678
         *        이름 : 윤동주
         *        나이 : 27
         *        전화번호 : 01034563456
         *
         * 4. sinsa 아이디 회원을 삭제하세요.
         *    메소드 : com.ohgiraffers.이름.map.member.MemberTest.test4()
         * */

        MemberTest mt = new MemberTest();

        System.out.println("==1==");
        mt.test1();

        System.out.println("\n==2==");
        mt.test2();

        System.out.println("\n==3==");
        mt.test3();

        System.out.println("\n==4==");
        mt.test4();
    }
}