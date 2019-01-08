package com.xwf.controller;

import com.xwf.service.impl.TeacherService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Resource
    TeacherService teacherService;


    @RequestMapping(value = "/getTeacherName/{id}", method = RequestMethod.GET)
    public String getTeacherName(HttpServletRequest Request, HttpServletResponse Response,
                                 @PathVariable(value="id") int id) {


        return teacherService.getTeacherInfoById(id).getName();
    }
}
