package com.zhangliang.mapper;

import com.zhangliang.pojo.Users;

import java.util.List;

/**
 * @Auther:zhangliang
 * @Date:2019/4/24
 * @Description:com.zhangliang.mapper
 * @version:1.0
 */
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
