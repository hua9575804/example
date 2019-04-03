package com.qianfeng.static1;

public class User {

    public static void main(String[] args) {
        AllProxy phoneProxy = new AllProxy();
        String phone = phoneProxy.salePhone();
        System.out.println("用户买到" + phone);
        String computer = phoneProxy.saleComputer();
        System.out.println("用户买到" + computer);
    }
}