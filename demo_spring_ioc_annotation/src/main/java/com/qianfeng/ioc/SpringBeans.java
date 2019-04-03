package com.qianfeng.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class SpringBeans {
    /**
     * 第三方类一种交给spring管理的一种方式
     * 优点：1.统一配置管理
     *       2.spring管理的对象、默认是单例的、
     *       减少对象的频繁创建和回收、降低了内存开销、
     *       提升了程序的执行效率
     * @return
     */
    @Bean//作用在方法上、表示该方法提供的bean可以进行注入到所需位置
    public Random provideRandom(){
        return new Random();
    }
}
