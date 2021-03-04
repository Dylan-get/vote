package com.homework.vote.service.impl;

import com.homework.vote.dao.UserDao;
import com.homework.vote.pojo.entity.User;
import com.homework.vote.service.RegisterService;

import javax.annotation.Resource;

public class RegisterServiceImpl implements RegisterService {
    @Resource
    UserDao userDao;
    @Override
    public boolean register(User user) {
        userDao.insert(user);
        return true;
    }
}
