package com.qianfeng.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Leader {

    @Qualifier("tea")//指定注入（类名小写）、/或者类的昵称
    @Autowired
    private IWater water;

    //引用第三方类
    @Autowired
    private Random random;

    public void drink(){
        System.out.println(random.nextInt() + "领导喝"+ water.getName());
    }

}
