package com.ohgiraffers.meta.api;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Applicaiton {

    public static void main(String[] args) {


        // 박싱/언박싱
        int intValue = 20;
//        Integer boxingNum = new Integer(intValue);
        Integer boxingNum = Integer.valueOf(intValue);
        int unBoxingNum = boxingNum.intValue();

        // 오토박싱/오토언박싱
        Integer boxingNumber = intValue;

        int unBoxingNumber = boxingNumber;

        // parsing : 문자열값을 기본자료형 값으로 변경 할 때
        int i = Integer.parseInt("4");
        double d = Double.parseDouble("8");

        String stringInt = Integer.valueOf(4).toString();

        Date date = new Date();
        System.out.println(date);

        LocalTime timeNow = LocalTime.now();
        System.out.println("timeNow = " + timeNow);
        
        LocalDate dateNow = LocalDate.now();
        System.out.println("dateNow = " + dateNow);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);
        /*
        * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html
        * */
        String timeNow2 = "21:19:47";

        LocalTime localTime = LocalTime.parse(timeNow2);
        System.out.println("localTime = " + localTime);

        String timeNow3 = "21-19-47";
        LocalTime localTime1 = LocalTime.parse(timeNow3, DateTimeFormatter.ofPattern("HH-mm-ss"));
        System.out.println("localTime1 = " + localTime1);
        
    }
}
