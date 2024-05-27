package com.ohgiraffers.hyejinkim.api;

public class Application {

    public static void main(String[] args) {

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(2, "목민심서", "정약용", 30000);
        Book book3 = new Book(2, "목민심서", "정약용", 30000);

        /*
        * 동등객체 : 주소가 다르더라도 필드값이 동일한 객체를 동등객체라고한다.
        * 동일객체 : 주소가 동일한 인스턴스를 동일객체라고한다.
        * */
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
        System.out.println("book3 = " + book3);

        System.out.println("book1.hashCode()  = " + book1.hashCode());
        System.out.println("book2.hashCode()  = " + book2.hashCode());
        System.out.println("book3.hashCode()  = " + book3.hashCode());

        System.out.println("book2 == boo3 : " + (book2 == book3));
        System.out.println(book2.equals(book3));
        System.out.println("book2 = " + book2.hashCode());
        System.out.println("book3 = " + book3.hashCode());
        System.out.println("=========================================");
        String str1 = "HelloWorld";
        String str2 = "HelloWorld";
        String str3 = new String("HelloWorld");
        String str4 = new String("HelloWorld");

        System.out.println("str1 = " + str1.hashCode());
        System.out.println("str2 = " + str2.hashCode());
        System.out.println("str3 = " + str3.hashCode());
        System.out.println("str4 = " + str4.hashCode());

        System.out.println(str1 == str2);  // true
        System.out.println(str3 == str4);  // false
        System.out.println(str3.equals(str4));
    }
}
