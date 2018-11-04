package com.nf147.pest.dao;

import com.nf147.pest.entity.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer user_id);

    int insert(User record);

    User selectByPrimaryKey(Integer user_id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    User login(User user);

    int updateStatus(User user);

    User  selectByUserName(String userName);

    int deleteByUserName(String userName);
}