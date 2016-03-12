package com.amazeyope.service;

import com.amazeyope.dao.UserMapper;
import com.amazeyope.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/3/13.
 */
@Service("userServiceI")
public class UserServiceImpl implements UserServiceI{

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }
}
