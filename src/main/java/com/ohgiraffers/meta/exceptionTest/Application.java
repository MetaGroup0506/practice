package com.ohgiraffers.meta.exceptionTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {

//        BufferedReader in = null; // Reader는 파일을 읽을때 사용
//
//        try {
//            in = new BufferedReader(new FileReader("test.dat"));
//
//            String s;
//
//            while((s = in.readLine()) != null) {
//                System.out.println(s);
//            }
//        } catch (Exception e) {
//            System.out.println("Exception 통과");
//            throw new RuntimeException(e);
//        } finally {
//
//            try {
//                if(in != null){
//                    in.close();
//                }
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

        try(BufferedReader in = new BufferedReader(new FileReader("test.dat"));) {
            String s;

            while((s = in.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("check1");
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("check2");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
