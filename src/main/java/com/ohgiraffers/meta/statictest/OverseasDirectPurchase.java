package com.ohgiraffers.meta.statictest;

public class OverseasDirectPurchase {

    // 해외직구
    public void buyDirectPurchase(int num) {

        System.out.println(">>>>>>>>>>>>>>> 해외 직구로 " + num + " 개 구매합니다.");
//        DepartmentStore departmentStore = new DepartmentStore();
//        departmentStore.buyProduct(num);
        DepartmentStore.stock -= num;
    }
}
