package com.haiqiu.datamanager.service;

import com.haiqiu.datamanager.poentity.UserPO;
import com.haiqiu.datamanager.response.Response;

/**
 * Created by peanut on 2019/7/4 下午1:13
 */
public interface UserService {
    Response register(UserPO user);

    Response login(UserPO user);

}
