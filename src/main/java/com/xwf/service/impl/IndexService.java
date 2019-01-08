package com.xwf.service.impl;

import com.xwf.dao.TeacherMapper;
import com.xwf.service.IIndexService;
import com.xwf.vo.Teacher;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class IndexService implements IIndexService {

    @Resource
    TeacherMapper teacherMapper;

    public Teacher index(){

        Teacher teacher = teacherMapper.selectByPrimaryKey(1);

        return teacher;
    }
}
