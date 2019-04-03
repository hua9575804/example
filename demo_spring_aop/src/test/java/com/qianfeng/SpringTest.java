package com.qianfeng;

import com.qianfeng.aop.ISalePhoneLicense;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringTest {

    @Autowired
    private ISalePhoneLicense salePhoneLicense;

    @Test
    public void test(){
        String phone = salePhoneLicense.salePhone();
        System.out.println("用户买" + phone);
        System.out.println("--------------------");
        salePhoneLicense.saleComputer(6);
    }

}
