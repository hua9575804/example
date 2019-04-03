package com.qianfeng.coffee;

import com.qianfeng.ioc.IWater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @Component("coffee")注解中的参数：定义类的昵称（spring）
 * 默认的名称是：类的名字开头小写
*/
@Component("coffee")//昵称
public class CoffeeWater implements IWater {

    //引用第三方类
    @Autowired
    private Random random;

    @Override
    public String getName() {
        return "咖啡" + random.nextInt();
    }
}
