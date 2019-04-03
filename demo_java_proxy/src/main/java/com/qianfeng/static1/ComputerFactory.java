package com.qianfeng.static1;

public class ComputerFactory implements ISaleComputerLicense {
    @Override
    public String saleComputer() {
        System.out.println("工厂生产电脑");
        return "电脑";
    }
}
