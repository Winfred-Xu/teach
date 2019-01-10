package com.xwf.service;

import com.xwf.vo.Teacher;

import java.util.List;

public interface ITeacherService {

    public Teacher getTeacherInfoById(int id);

    public List<Teacher> getTeacherInfoByIds(List<Integer> ids);

}
