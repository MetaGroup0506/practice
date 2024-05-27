package com.ohgiraffers.meta.collection;

import com.ohgiraffers.meta.member.MemberDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Hello");
//        list.add("World");
        List<MemberDTO> members = new ArrayList<>();
        members.add(new MemberDTO());
        members.add(new MemberDTO());
        System.out.println("list = " + members);

//        list.add(1);
//        list = new LinkedList<>(list);
    }
}
