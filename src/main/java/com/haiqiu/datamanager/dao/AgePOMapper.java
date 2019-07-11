package com.haiqiu.datamanager.dao;

import com.haiqiu.datamanager.poentity.AgePO;

public interface AgePOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AgePO record);

    int insertSelective(AgePO record);

    AgePO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgePO record);

    int updateByPrimaryKey(AgePO record);
}