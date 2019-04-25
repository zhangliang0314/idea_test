package com.zhangliang.web.controller;

import com.zhangliang.pojo.Users;
import com.zhangliang.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther:zhangliang
 * @Date:2019/4/25
 * @Description:com.zhangliang.web.controller
 * @version:1.0
 */
@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUser")
    public String addUser(Users users){
        this.usersService.addUser(users);
        return "ok";
    }
}
