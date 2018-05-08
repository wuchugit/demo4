package com.chu.controller;

import com.chu.entity.User;
import com.chu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class Controoler {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/test2")
    @ResponseBody
    public  User  index2(String id){
//		User user = userMapper.findByName("wuchu1");
        System.out.println("indexxxxxxxxxx");
        User a = userMapper.findByName("wuchu1");
        System.out.println(a.getId());
        return a;
    }



}
