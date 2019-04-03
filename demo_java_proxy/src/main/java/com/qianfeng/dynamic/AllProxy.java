package com.qianfeng.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理、实现InvocationHandler接口
 */
public class AllProxy implements InvocationHandler {

    //动态代理是有相同执照的工厂
    private ISaleLicense factory;

    //参数：实现了ISaleLicense执照工厂对象
    public AllProxy(ISaleLicense factory) {
        this.factory = factory;
    }

    private void beforeService(){
        System.out.println("售前服务");
    }

    private void afterService(){
        System.out.println("售后服务");
    }

    /**
     * 动态代理核心方法
     * @param proxy 代理本身（不用）
     * @param method（被代理的工厂方法）
     * @param args（被代理的方法的参数）
     * @return返回执行代理方法之后的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        beforeService();
        //factory：被代理的工厂对象
        Object result = method.invoke(factory, args);
        afterService();
        return result;
    }
}
