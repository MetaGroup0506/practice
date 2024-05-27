package com.ohgiraffers.meta.collection;

import com.ohgiraffers.meta.api.Book;

import java.util.*;

public class Application2 {

    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "홍길동전", "허균", 40000));
        bookList.add(new Book(2, "목민심서", "정약용", 50000));
        bookList.add(new Book(3, "동의보감", "허준", 80000));
        bookList.add(new Book(4, "삼국사기", "김부식", 70000));

        System.out.println("bookList.size() = " + bookList.size());

        for(Book book : bookList) {
            System.out.println(book);
        }

        System.out.println("bookList 1번째 : " + bookList.get(0));
        System.out.println("bookList 2번째 : " + bookList.get(1));
        System.out.println("bookList 3번째 : " + bookList.get(2));
        System.out.println("bookList 4번째 : " + bookList.get(3));
//        System.out.println("bookList 5번째 : " + bookList.get(4));
        bookList.remove(0);
        System.out.println("===============================================================");
        for(Book book : bookList) {
            System.out.println(book);
        }
        bookList.set(0, new Book(1, "홍길동전", "허균", 40000));
        System.out.println("===============================================================");
        for(Book book : bookList) {
            System.out.println(book);
        }

        // 1. toArray()
        HashSet<String> hset = new HashSet<>();
        hset.add("java");
        hset.add("mysql");
        hset.add("html");
        hset.add("css");
        hset.add("javascript");

        System.out.println("hset = " + hset);

        Object[] array = hset.toArray();
        for(int i = 0; i < array.length; i++) {
            System.out.println(i + " : " + array[i]);
        }
        // 2. iterator()
        Iterator<String> iterator = hset.iterator();
        while (iterator.hasNext()) { // 꺼낼요소가 있는지 여부를 판단
            System.out.println(iterator.next());
        }
        System.out.println("=========================================");
        while (iterator.hasNext()) { // 꺼낼요소가 있는지 여부를 판단
            System.out.println(iterator.next());
        }
        System.out.println("=========================================");
        Set<Integer> lotto = new TreeSet<>();

        while(lotto.size() < 6) { // 0 1 2 3 4 5
            lotto.add(((int) (Math.random() * 45) + 1));
        }

        System.out.println("lotto = " + lotto);


    }
}
