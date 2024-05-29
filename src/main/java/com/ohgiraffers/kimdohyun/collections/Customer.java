package com.ohgiraffers.kimdohyun.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/*
 *   Customer.java
 *   Author : syamcat
 *   Created : 24. 5. 29.
 **/
public class Customer {
    private List<String[]> customers = new ArrayList<>();

    public void addCustomer(String customerData){
        String[] data = customerData.split(",");
        this.customers.add(data);
    }

    public void addCustomer(int idx, String customerData){
        String[] data = customerData.split(",");
        this.customers.add(idx, data);
    }

    public void sortCustomers(int idx) {
        if (idx != 0) {
            customers.sort((a, b) -> a[0].compareTo(b[0]));
        }
        customers.sort((a, b) -> a[idx].compareTo(b[idx]));
    }

    public void printList() {   // Print Customers List
        System.out.println("=-=-=-=-=-=-=-=-Customers List=-=-=-=-=-=-=-=");
        for (String[] data : customers) {
            System.out.println(Arrays.toString(data));
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

}
