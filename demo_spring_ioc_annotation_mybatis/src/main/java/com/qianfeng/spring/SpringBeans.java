package com.qianfeng.spring;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.io.IOException;
import java.io.InputStream;

@Configuration
public class SpringBeans {

    //如果此对象不需要注入到其他位置、就不需要交给spring管理
    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<>();

    @Bean//SqlSessionFactory交给spring管理。spring默认情况下的对象管理是单例的。
    public SqlSessionFactory provideSqlSessionFactory() throws IOException {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.cfg.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            return sessionFactory;
    }

    /**
     * 1.保证provideSession每次都执行
     * 2.ThreadLocal
     * @param sqlSessionFactory
     * @return
     * @Scope("prototype")：更改配置、每次请求都会创建新的不同对象（默认只是第一次创建）
     */
    @Scope("prototype")
    @Bean
    public SqlSession provideSession(SqlSessionFactory sqlSessionFactory) {
//        System.out.println("---------------provideSession--------------");
        //判断threadLocal中是否有session
        SqlSession session = threadLocal.get();
        if (session == null) {
            System.out.println("---------------open Session--------------");
            //产生session
            session = sqlSessionFactory.openSession();
            threadLocal.set(session);
        }
        return session;
    }
}
