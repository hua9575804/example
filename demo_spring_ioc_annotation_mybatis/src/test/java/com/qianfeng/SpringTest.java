package com.qianfeng;

import com.qianfeng.dao.IStudentDAO;
import com.qianfeng.dao.impl.StuDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringTest {

    @Qualifier("stuDAO")
    @Autowired
    private IStudentDAO studentDAO;

    @Test
    public void test(){
        TbStudent tbStudent = studentDAO.queryStudentById(1L);
        System.out.println(tbStudent.getStuName());
    }
}
