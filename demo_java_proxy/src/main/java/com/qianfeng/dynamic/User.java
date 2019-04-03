package com.qianfeng.dynamic;

import java.lang.reflect.Proxy;

public class User {

    public static void main(String[] args) {
        //参数1：类加载器的对象ClassLoader（全局唯一）
        ClassLoader classLoader = User.class.getClassLoader();
        //参数2：执照（从工厂的对象上获取）
        Class<?>[] interfaces = ComputerFactory.class.getInterfaces();//获取工厂所有的接口
        //参数3：需要被代理的工厂对象
        ComputerFactory computerFactory = new ComputerFactory();
//        PhoneFactory phoneFactory = new PhoneFactory();
        AllProxy allProxy = new AllProxy(computerFactory);
        //代理生成
        ISaleLicense proxyInstance = (ISaleLicense) Proxy.newProxyInstance(classLoader, interfaces, allProxy);
        String product = proxyInstance.saleAll();
        System.out.println("用户买" + product);
    }
}
