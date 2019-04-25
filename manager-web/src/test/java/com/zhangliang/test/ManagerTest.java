package com.zhangliang.test;

import com.zhangliang.mapper.UsersMapper;
import com.zhangliang.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther:zhangliang
 * @Date:2019/4/25
 * @Description:com.zhangliang.test
 * @version:1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUserTest(){
        Users users = new Users();
        users.setUsersge(20);
        users.setUsername("admin");
        this.usersMapper.insertUser(users);
    }
}

