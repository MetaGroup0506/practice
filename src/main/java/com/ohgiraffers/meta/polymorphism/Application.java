package com.ohgiraffers.meta.polymorphism;

import com.ohgiraffers.meta.NormalStudent;
import com.ohgiraffers.meta.OhgiraffersStudent;
import com.ohgiraffers.meta.Student;

import javax.management.remote.SubjectDelegationPermission;
import java.util.Random;

public class Application {

    public static void main(String[] args) {

//        NormalStudent normalStudent = new NormalStudent();
//        normalStudent.setName("홍길동");
//        System.out.println(normalStudent.getName());
//
//        OhgiraffersStudent ohgiraffersStudent = new OhgiraffersStudent();
//        ohgiraffersStudent.setName("유관순");
//        System.out.println(ohgiraffersStudent.getName());
//        printStudent(ohgiraffersStudent);
//        Student student = new Student();
//
//        NormalStudent normalStudent = new NormalStudent();
//        normalStudent.getName();

//        Student student = returnStudent();
//        if(student instanceof NormalStudent)
//            System.out.println("student = " + ((NormalStudent) student).getName());
//        else if (student instanceof OhgiraffersStudent)
//            System.out.println("student = " + ((OhgiraffersStudent) student).getName());

        Student student = new Student();
        System.out.println("student = " + student.toString());

        OhgiraffersStudent ohgiraffersStudent = new OhgiraffersStudent();
        System.out.println(ohgiraffersStudent.toString());
    }

//    public void printNormalStudent(NormalStudent normalStudent) {
//        System.out.println(normalStudent);
//    }
//
//    public void printOhgiraffersStudent(OhgiraffersStudent ohgiraffersStudent) {
//        System.out.println(ohgiraffersStudent);
//    }

    public static void printStudent(Student student) {
        System.out.println(student);
    }

    public static Student returnStudent() {

        int random = (int) (Math.random() * 2);
        System.out.println("random = " + random);
        return random == 0? new NormalStudent("홍길동") : new OhgiraffersStudent("유관순");
    }

    // 업캐스팅 , 다운캐스팅
}
