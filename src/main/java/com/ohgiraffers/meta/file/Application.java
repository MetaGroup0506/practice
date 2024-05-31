package com.ohgiraffers.meta.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        /*
        * ObjectInputStream/ObjectOutputStream : 객체단위로 입출력
        * */
        List<MemberDTO> outputMember = new ArrayList<>();
        outputMember.add(new MemberDTO("user01", "pass01", "홍길동", "hong123@gmail.com", 35, '남'));
        outputMember.add(new MemberDTO("user02", "pass02", "유관순", "you123@gmail.com", 16, '여'));
        outputMember.add(new MemberDTO("user03", "pass03", "강감찬", "kang123@gmail.com", 33, '남'));

        ObjectOutputStream objOut = null;

        try {
//            objOut = new ObjectOutputStream(
//                            new BufferedOutputStream(
//                                    new FileOutputStream("src/main/java/com/ohgiraffers/meta/file/testObjectStream.txt", true)));
            boolean isExists = new File("src/main/java/com/ohgiraffers/meta/file/testObjectStream.txt").exists();
            System.out.println("isExists = " + isExists);

            if(isExists) { /* 파일이 있는 경우 */
                objOut = new MyOutputStream(
                                new BufferedOutputStream(
                                        new FileOutputStream("src/main/java/com/ohgiraffers/meta/file/testObjectStream.txt", true)));
            } else { /* 파일이 없는 경우 */
                objOut = new ObjectOutputStream(
                                new BufferedOutputStream(
                                        new FileOutputStream("src/main/java/com/ohgiraffers/meta/file/testObjectStream.txt", true)));
            }
            
            for(int i = 0; i < outputMember.size(); i++){
                objOut.writeObject(outputMember.get(i));
            }

            objOut.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            if(objOut != null) {
                try {
                    objOut.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("===================================================================");
        List<MemberDTO> memberDTOList = new ArrayList<>();

        ObjectInputStream objIn = null;

        try {
            objIn = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream("src/main/java/com/ohgiraffers/meta/file/testObjectStream.txt")));
            while(true) {
                System.out.println(objIn.readObject());
            }

        } catch (EOFException e) {
            System.out.println("끝");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {

            if(objIn != null) {
                try {
                    objIn.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
