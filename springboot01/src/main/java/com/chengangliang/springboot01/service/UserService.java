package com.chengangliang.springboot01.service;

import com.chengangliang.springboot01.bean.Users;

import java.util.List;

public interface UserService {
    public List<Users> findAll();
    public void updateUser();
}
