package com.haiqiu.datamanager.dao;

import com.haiqiu.datamanager.poentity.MatchPO;

import java.util.List;

public interface MatchPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MatchPO record);

    int insertSelective(MatchPO record);

    MatchPO selectByPrimaryKey(Integer id);

    List<MatchPO> selectBySe(Integer seId);

    List<MatchPO> selectByRoId(Integer roId);


    int updateByPrimaryKeySelective(MatchPO record);

    int updateByPrimaryKey(MatchPO record);

    int deleteAll();
}
