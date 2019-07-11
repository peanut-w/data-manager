package com.haiqiu.datamanager.dao;


import com.haiqiu.datamanager.poentity.UserPO;

import java.util.ArrayList;


public interface UserPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserPO record);

    int insertSelective(UserPO record);

    UserPO selectByPrimaryKey(Integer id);

    UserPO selectByName(String name);

    ArrayList<UserPO> selectAll();

    int updateByPrimaryKeySelective(UserPO record);

    int updateByPrimaryKey(UserPO record);
}
