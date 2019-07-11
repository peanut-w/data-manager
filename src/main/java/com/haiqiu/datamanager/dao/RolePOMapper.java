package com.haiqiu.datamanager.dao;

import com.haiqiu.datamanager.poentity.RolePO;

public interface RolePOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RolePO record);

    int insertSelective(RolePO record);

    RolePO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RolePO record);

    int updateByPrimaryKey(RolePO record);
}
