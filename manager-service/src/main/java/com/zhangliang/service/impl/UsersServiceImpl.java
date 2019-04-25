package com.zhangliang.service.impl;

import com.zhangliang.mapper.UsersMapper;
import com.zhangliang.pojo.Users;
import com.zhangliang.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther:zhangliang
 * @Date:2019/4/25
 * @Description:com.zhangliang.service.impl
 * @version:1.0
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;
    @Override
    public void addUser(Users users) {
        this.usersMapper.insertUser(users);
    }
}
