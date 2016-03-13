package com.amazeyope.service;

import com.amazeyope.dao.UserMapper;
import com.amazeyope.model.Page;
import com.amazeyope.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/3/13.
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserServiceI {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int delete(String id) {
        return userMapper.deleteById(id);
    }

    @Override
    public User getUserById(String id) {
        return userMapper.getUserById(id);
    }

    @Override
    public int update(User user) {
        return userMapper.updateById(user);
    }

    @Override
    public int insertSelective(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public int updateByIdSelective(User user) {
        return userMapper.updateByIdSelective(user);
    }

    @Override
    public List<User> queryUserListByPage(Page page) {
        Map<String,Object> parameter = new HashMap<String, Object>();
        parameter.put("page",page);
        return userMapper.queryUserListByPage(parameter);
    }
}
