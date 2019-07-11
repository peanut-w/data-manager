package com.haiqiu.datamanager.dao;

import com.haiqiu.datamanager.poentity.TeamPO;

public interface TeamPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeamPO record);

    int insertSelective(TeamPO record);

    TeamPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeamPO record);

    int updateByPrimaryKey(TeamPO record);

    int deleteAll();

}
