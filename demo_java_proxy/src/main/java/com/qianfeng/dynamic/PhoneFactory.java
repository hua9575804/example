package com.qianfeng.dynamic;

public class PhoneFactory implements ISaleLicense {

    @Override
    public String saleAll() {
        System.out.println("生产手机");
        return "手机";
    }
}
