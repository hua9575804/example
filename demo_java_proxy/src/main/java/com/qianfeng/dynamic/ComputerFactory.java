package com.qianfeng.dynamic;

public class ComputerFactory implements ISaleLicense {
    @Override
    public String saleAll() {
        System.out.println("生产电脑");
        return "电脑";
    }
}
