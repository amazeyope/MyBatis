package com.amazeyope.service;

import com.alibaba.fastjson.JSON;
import com.amazeyope.base.BaseTest;
import com.amazeyope.model.User;
import org.codehaus.jackson.map.util.JSONPObject;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

/**
 * Created by ningyp on 2016/3/13.
 */
public class UserServiceImplTest extends BaseTest{


    @Resource
    UserServiceImpl userServiceI;

    @Test
    public void testGetAll() throws Exception {
        List userList= userServiceI.getAll();
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("userList"+JSON.toJSONString(userList));
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
    }

    @Test
    public void testInsert() throws Exception {
        User user=new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("amezeyope");
        user.setAge("18");
        user.setAddress("China");
        userServiceI.insert(user);
    }

    @Test
    public void testDelete() throws Exception {

    }

    @Test
    public void testGetUserById() throws Exception {

    }

    @Test
    public void testUpdate() throws Exception {

    }

    @Test
    public void testInsertSelective() throws Exception {

    }

    @Test
    public void testUpdateByIdSelective() throws Exception {

    }
}