package com.xwf.service.impl;

import com.xwf.dao.TeacherMapper;
import com.xwf.service.ITeacherService;
import com.xwf.vo.Teacher;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherService implements ITeacherService {

    @Resource
    TeacherMapper teacherMapper;

    public Teacher getTeacherInfoById(int id) {

        Teacher teacher = teacherMapper.selectByPrimaryKey(id);

        return teacher;
    }

    public List<Teacher> getTeacherInfoByIds(List<Integer> ids) {
        List<Teacher> teachers = teacherMapper.selectByPrimaryKeys(ids);
        return teachers;
    }

}
