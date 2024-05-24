package com.ohgiraffers.meta.statictest;

public class Application {

    public static void main(String[] args) {

        System.out.println(">>>>>>> 🏢 백화점 개 점 !🏢 <<<<<<<<");
        DepartmentStore departmentStore = new DepartmentStore();
        departmentStore.getStockCount();
        departmentStore.buyProduct(3);
        departmentStore.getStockCount();

        System.out.println("-=-=-=-=  ✈️ 해외 직구 ✈️ -=-=-=-");
        OverseasDirectPurchase op = new OverseasDirectPurchase();
        op.buyDirectPurchase(5);
        departmentStore.getStockCount();


    }
}
