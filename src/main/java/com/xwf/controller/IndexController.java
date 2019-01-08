package com.xwf.controller;

import com.xwf.service.IIndexService;
import com.xwf.service.impl.IndexService;
import com.xwf.vo.Teacher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping("/home")
public class IndexController {

    @Resource
    IIndexService isc;

    @RequestMapping("/index")
    public String index() {
        String name = isc.index().getName();
        String sss = "";
        try {
            sss = new String(name.getBytes(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return sss;
    }
}
