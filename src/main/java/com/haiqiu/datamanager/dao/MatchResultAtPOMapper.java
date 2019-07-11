package com.haiqiu.datamanager.dao;

import com.haiqiu.datamanager.poentity.MatchResultAtPO;

import java.util.List;

public interface MatchResultAtPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MatchResultAtPO record);

    int insertSelective(MatchResultAtPO record);

    MatchResultAtPO selectByPrimaryKey(Integer id);

    List selectAll();


    int updateByPrimaryKeySelective(MatchResultAtPO record);

    int updateByPrimaryKey(MatchResultAtPO record);
}
