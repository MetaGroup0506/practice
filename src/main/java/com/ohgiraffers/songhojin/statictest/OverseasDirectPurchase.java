package com.ohgiraffers.songhojin.statictest;

public class OverseasDirectPurchase {

    public void buyDirectPurchase(int num) {
        System.out.println(">>>>>>>>>>>>>> 해외 직구로 " + num + " 개 구매합니다.");
        DepartmentStore.stock -= num;
    }
}
