package com.amazeyope.controller;

import com.amazeyope.model.User;
import com.amazeyope.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2016/3/13.
 */

@Controller
@RequestMapping("/userController")
public class UserController {
    @Resource
    private UserServiceI userService;



    @RequestMapping(value="/listUser")
    public String listUser(HttpServletRequest request) {

        List<User> list = userService.getAll();
        request.setAttribute("userlist", list);
        return "listUser";
    }
}
