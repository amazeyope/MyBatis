package com.amazeyope.dao;

import com.amazeyope.model.User;

import java.util.List;

/**
 * Created by Administrator on 2016/3/13.
 */
public interface UserMapper {

    List<User> getAll();

    int insert(User user);

    int deleteById(String id);

    int updateById(User user);

    User getUserById(String id);

    int insertSelective(User user);

    int updateByIdSelective(User user);
}
