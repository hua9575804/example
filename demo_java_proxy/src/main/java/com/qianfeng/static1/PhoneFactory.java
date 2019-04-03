package com.qianfeng.static1;

public class PhoneFactory implements ISalePhoneLicense {

    @Override
    public String salePhone() {
        System.out.println("工厂生产手机");
        return "手机";
    }
}
