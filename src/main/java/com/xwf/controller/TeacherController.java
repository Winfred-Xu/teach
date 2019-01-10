package com.xwf.controller;

import com.xwf.service.impl.TeacherService;
import com.xwf.vo.Teacher;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Resource
    TeacherService teacherService;


    @RequestMapping(value = "/getTeacherName/{id}", method = RequestMethod.GET)
    public String getTeacherName(@PathVariable(value = "id") int id) {
        return teacherService.getTeacherInfoById(id).getName();
    }

    @RequestMapping(value = "/getTeacherNames", method = RequestMethod.GET)
    public List<Teacher> getTeacherNames(HttpServletRequest request) {

        String teacherIds = request.getParameter("teacherIds");
        String[] list = teacherIds.split(",");
        //同上，都可转String为List<String>
        //List<String> list = Arrays.asList(teacherIds.split(","));
        List<Integer> ids = new ArrayList<>(list.length);
        //list需要逐条赋值
        for(int i=0; i<list.length; i++){
            ids.add(Integer.valueOf(list[i]).intValue());
        }

        List<Teacher> teachers = teacherService.getTeacherInfoByIds(ids);

        return teachers;
    }

    @RequestMapping(value = "/getTeacherName2", method = RequestMethod.POST)
    public List<Teacher> getTeacherName2(@RequestBody Map map) {

        //获取入参中的ids并转为List<Integer>
        List<Integer> ids = (ArrayList<Integer>)map.get("ids");

        List<Teacher> teachers = teacherService.getTeacherInfoByIds(ids);

        return teachers;
    }

}
