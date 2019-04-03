package com.qianfeng.static1;

public class AllProxy implements ISalePhoneLicense,ISaleComputerLicense{

    private void beforeSale(){
        System.out.println("售前服务");
    }

    private void afterSale(){
        System.out.println("售后服务");
    }

    @Override
    public String salePhone() {

        //售前
        beforeSale();

        //从手机工厂进货
        String phone = new PhoneFactory().salePhone();

        //售后
        afterSale();
        return phone;

    }

    @Override
    public String saleComputer() {

        //售前
        beforeSale();

        //从手机工厂进货
        String computer = new ComputerFactory().saleComputer();

        //售后
        afterSale();
        return computer;
    }
}
