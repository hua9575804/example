package com.qianfeng;

import com.qianfeng.dao.impl.StuDAO;
import com.qianfeng.dao.impl.StuDAO2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        //spring容器初始化（spring工厂）
//        final ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //线程1
        new Thread(new Runnable() {
            @Override
            public void run() {
                //spring容器初始化（spring工厂）
                final ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
                StuDAO stuDAO = applicationContext.getBean(StuDAO.class);
                TbStudent tbStudent = stuDAO.queryStudentById(1L);
                System.out.println("线程1："+tbStudent.getStuName());

//                StuDAO2 stuDAO2 = applicationContext.getBean(StuDAO2.class);
//                TbStudent tbStudent2 = stuDAO2.queryStudentById(2L);
//                System.out.println("线程2："+tbStudent2.getStuName());
            }
        }).start();

        //线程2
        new Thread(new Runnable() {
            @Override
            public void run() {
                //spring容器初始化（spring工厂）
                final ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
                StuDAO2 stuDAO2 = applicationContext.getBean(StuDAO2.class);
                TbStudent tbStudent = stuDAO2.queryStudentById(2L);
                System.out.println("线程2："+tbStudent.getStuName());
            }
        }).start();
    }
}
