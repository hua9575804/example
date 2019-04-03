package com.qianfeng.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect//将当前类定义为切面（代理）
public class MyProxy {

    //切面1

    /**
     *  @Before
     *  @After
     *  execution("") * 通配 ..可变参数
     */
    //在执行salePhone方法执行之前、先执行beforeService
    @Before("execution(public * com.qianfeng.aop.PhoneFactory.*(..))")
    public void beforeService(){
        System.out.println("售前服务");
    }
    //切面2
    @After("execution(public * com.qianfeng.aop.PhoneFactory.*(..))")
    public void afterService(){
        System.out.println("售后服务");
    }


}
