package com.haiqiu.datamanager.dao;

import com.haiqiu.datamanager.poentity.MatchEventPO;

import java.util.List;

public interface MatchEventPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MatchEventPO record);

    int insertSelective(MatchEventPO record);

    MatchEventPO selectByPrimaryKey(Integer id);

    List<MatchEventPO> selectByMaId(Integer maId);

    int updateByPrimaryKeySelective(MatchEventPO record);

    int updateByPrimaryKey(MatchEventPO record);

    int deleteAll();
}
