package com.ohgiraffers.songhojin.statictest;

public class Application {
    public static void main(String[] args) {
//        DepartmentStore departmentStore = new DepartmentStore();
//        departmentStore.stock = 29;
//        System.out.println("departmentStore = " + departmentStore.stock);
//
//        DepartmentStore departmentStore1 = new DepartmentStore();
//        System.out.println("departmentStore1 = " + departmentStore1.stock);
        System.out.println(">>>>>>>>> 🏬 백화점 개 점 !🏬 <<<<<<<<<<<");
        DepartmentStore departmentStore = new DepartmentStore();
        departmentStore.getStockCount();
        departmentStore.buyProduct(3);
        departmentStore.getStockCount();

        System.out.println("-=-=-=-= ✈️ 해외 직구 ✈️ -=-=-=-");
        OverseasDirectPurchase op = new OverseasDirectPurchase();
        op.buyDirectPurchase(5);
        departmentStore.getStockCount();
    }
}
