package com.qianfeng.dao.impl;

import com.qianfeng.TbStudent;
import com.qianfeng.dao.IStudentDAO;
import com.qianfeng.mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StuDAO implements IStudentDAO {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public TbStudent queryStudentById(Long stuId) {
        TbStudent tbStudent = sqlSession.getMapper(StudentMapper.class).queryStudentById(stuId);
        return tbStudent;
    }
}
