package com.smart.service;

import com.smart.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import java.util.Date;

/**
 * Created by xianyu.hxy on 2015/9/11.
 */
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class UserServiceTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private UserService userService;
    @Test
    public void hasMatchUser(){
        boolean b1=userService.hasMatchUser("admin","123456");
        boolean b2=userService.hasMatchUser("admin","1111");
        assertTrue(b1);
        assertTrue(!b2);
    }
    @Test
    public void findUserByUserName(){
        User user=userService.findUserByUserName("admin");
        assertEquals(user.getUserName(),"admin");
    }

    public void loginSuccess(){
        User user=userService.findUserByUserName("admin");
        user.setUserId(1);
        user.setUserName("admin");
        user.setLastIp("192.168.12.7");
        user.setLastVist(new Date());
        userService.loginSuccess(user);
    }

}
