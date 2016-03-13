package com.amazeyope.controller;

import com.amazeyope.model.Page;
import com.amazeyope.model.User;
import com.amazeyope.service.UserServiceI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2016/3/13.
 */

@Controller
@RequestMapping("/userController")
public class UserController {
    @Resource
    private UserServiceI userService;



    @RequestMapping(value="/addUser")
    public String addUser(User user) {
        String id = UUID.randomUUID().toString();
        user.setId(id);
        userService.insert(user);
        return "redirect:/userController/listUser.do";
    }

    @RequestMapping(value="/deleteUser")
    public String deleteUser(String id) {
        userService.delete(id);
        return "redirect:/userController/listUser.do";
    }

    @RequestMapping(value="/getUserById")
    public String getUserById(String id, HttpServletRequest request) {
        User user = userService.getUserById(id);
        request.setAttribute("user", user);
        return "updateUser";
    }

    @RequestMapping(value="/updateUser")
    public String updateUser(User user) {
        userService.update(user);
        return "redirect:/userController/listUser.do";
    }

  /*  @RequestMapping(value="/listUser")
    public String listUser(HttpServletRequest request) {
        List<User> list = userService.getAll();
        request.setAttribute("userlist", list);
        return "listUser";
    }*/

    @RequestMapping(value="/listUser")
    public String listUser(HttpServletRequest request) {
        String currentPage = request.getParameter("currentPage");
        Page page = new Page();
        Pattern pattern = Pattern.compile("[0-9]{1,9}");
        if(currentPage == null ||  !pattern.matcher(currentPage).matches()) {
            page.setCurrentPage(1);
        } else {
            page.setCurrentPage(Integer.valueOf(currentPage));
        }
        List<User> list = userService.queryUserListByPage(page);
        request.setAttribute("userlist", list);
        request.setAttribute("page",page);
        return "listUser";
    }
}
