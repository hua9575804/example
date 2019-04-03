package com.qianfeng.service.impl;

import com.qianfeng.dao.StudentMapper;
import com.qianfeng.dto.TbStudent;
import com.qianfeng.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public TbStudent queryStudentById(Long stuId) {
        TbStudent tbStudent = studentMapper.queryStudentById(stuId);
        return tbStudent;
    }
}
