package com.chengangliang.springboot01.maping;

import com.chengangliang.springboot01.bean.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    Users selectByPrimaryKey(Integer id);

    List<Users> selectAll();

    int updateByPrimaryKey(Users record);
}