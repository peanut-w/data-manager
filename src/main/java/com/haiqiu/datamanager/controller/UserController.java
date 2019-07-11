package com.haiqiu.datamanager.controller;

import com.haiqiu.datamanager.dao.UserPOMapper;
import com.haiqiu.datamanager.poentity.UserPO;
import com.haiqiu.datamanager.response.Response;
import com.haiqiu.datamanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


/**
 * Created by peanut on 2019/6/4 下午4:56
 */

@RestController
@RequestMapping("user/")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserPOMapper userPOMapper;

    @PostMapping("register")
    public Response register(@RequestBody UserPO userPO) {
        return userService.register(userPO);
    }

    @PostMapping("passport/signIn")
    public Response login(@RequestBody UserPO userPO) {
        return userService.login(userPO);
    }

    @PostMapping("userList")
    public Response userList() {
        ArrayList<UserPO> persons = userPOMapper.selectAll();
        return Response.successResponse(persons.get(0));
    }
}
