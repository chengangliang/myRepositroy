package com.chengangliang.springboot01.service.impl;

import com.chengangliang.springboot01.bean.Users;
import com.chengangliang.springboot01.maping.UsersMapper;
import com.chengangliang.springboot01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public List<Users> findAll() {
        return usersMapper.selectAll();
    }
    @Override
    public void updateUser() {
        Users users =new Users();
        users.setId(3);
        users.setAddress("杭州");
        users.setBirthday(new Date());
        users.setUsername("丁丁");
        users.setSex("男");
        usersMapper.updateByPrimaryKey(users);
        throw new RuntimeException();
    }
}
