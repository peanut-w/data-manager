package com.haiqiu.datamanager.dao;

import com.haiqiu.datamanager.poentity.SportPO;

public interface SportPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SportPO record);

    int insertSelective(SportPO record);

    SportPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SportPO record);

    int updateByPrimaryKey(SportPO record);
}
