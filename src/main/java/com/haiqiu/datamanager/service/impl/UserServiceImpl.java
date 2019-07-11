package com.haiqiu.datamanager.service.impl;


import com.haiqiu.datamanager.dao.UserPOMapper;
import com.haiqiu.datamanager.poentity.UserPO;
import com.haiqiu.datamanager.response.Response;
import com.haiqiu.datamanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by peanut on 2019/6/4 下午4:21
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserPOMapper userPOMapper;

    @Override
    public Response register(UserPO user) {
//        判断用户是否填写注册信息
        if (user != null) {
            if (userPOMapper.selectByName(user.getName()) == null) {
                // TODO: 2019/6/4  这里应该对密码进行加密，不可以暴露用户的密码
                userPOMapper.insert(user);
                return Response.createResponse("success", "注册成功");
            } else {
                return Response.createResponse("failed", "注册失败,此用户名已经存在！");
            }
        } else {
            return Response.createResponse("failed", "注册失败，请填写注册信息！");
        }

    }

    @Override
    public Response login(UserPO user) {
        if (user != null) {
            //数据库中的用户信息
            UserPO dataUser = userPOMapper.selectByName(user.getName());
            if (dataUser != null) {
                // TODO: 2019/6/4  数据库中查出来的密码应该是密文的 密码加密解密操作
//                数据库中用户的密码和用户输入的密码进行比较
                if (dataUser.getPassword().equals(user.getPassword())) {
                    return Response.successResponse("登陆成功！");
                } else {
                    return Response.failedResponse("密码错误！");
                }
            } else {
                return Response.failedResponse("此用户不存在！");
            }
        } else {
            return Response.failedResponse("请输入登录信息！");
        }

    }
}
