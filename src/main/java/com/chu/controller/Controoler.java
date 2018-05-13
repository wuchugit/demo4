package com.chu.controller;

import com.chu.entity.Tuser;
import com.chu.entity.User;
import com.chu.entity.UserPro;
import com.chu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class Controoler {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/test2")
    @ResponseBody
    public  User  index2(String id){
        User user = userMapper.findByName("wuchu1");
        return user;
    }

    @RequestMapping("/test3")
    @ResponseBody
    public UserPro index3(String id){
        User user = userMapper.findByName("wuchu1");
        UserPro up = new UserPro();
        up.setUser(user);
        List<Tuser> tuser = userMapper.findById("1");
        up.setUser_id(tuser.get(0).getUser_id());
        up.setUser_name(tuser.get(0).getUser_name());
        return up;
    }


}
