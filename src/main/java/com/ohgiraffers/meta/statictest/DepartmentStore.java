package com.ohgiraffers.meta.statictest;

public class DepartmentStore {

    // 백화점 : 한정판 신발판매점

    public static int stock = 30;

    public void getStockCount() {
        System.out.println(">>>>>>>>>>> 현재 한정판 👟 " + stock + "개 남았습니다.");
    }

    public void buyProduct(int num) {
        System.out.println(">>>>>>>>>>>>>>>>> 상품을 " + num + " 개 구매합니다.");
        stock -= num;
    }
}


