package com.homework.vote.controller;


import com.homework.vote.dao.UserDao;
import com.homework.vote.pojo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class indexController {

    @Resource
    UserDao userDao;
    @RequestMapping("/")
    String index(){
        User user = userDao.selectByPrimaryKey(1);
        return "index";
    }
}
