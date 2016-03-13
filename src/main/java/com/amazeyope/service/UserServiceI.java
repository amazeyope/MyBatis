package com.amazeyope.service;

import com.amazeyope.model.Page;
import com.amazeyope.model.User;

import java.util.List;

/**
 * Created by Administrator on 2016/3/13.
 */
public interface UserServiceI {
    /**
     * 获取全部用户
     * @return
     */
    List<User> getAll();

    /**
     * 新增用户
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int delete(String id);

    /**
     * 通过ID获取用户详细信息
     * @param id
     * @return
     */
    User getUserById(String id);

    /**
     * 更新用户
     * @param user
     * @return
     */
    int update(User user);

    /**
     * 选择性插入字段
     * @param user
     * @return
     */
    int insertSelective(User user);

    /**
     * 选择性更新字段
     * @param user
     * @return
     */
    int updateByIdSelective(User user);

    /**
     *
     * @return
     */
    List<User> queryUserListByPage(Page page);
}
