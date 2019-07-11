package com.haiqiu.datamanager.dao;

import com.haiqiu.datamanager.poentity.RoundPO;

import java.util.List;

public interface RoundPOMapper {
    int deleteByPrimaryKey(Integer id);

    int deleteAll();

    int insert(RoundPO record);

    int insertSelective(RoundPO record);

    RoundPO selectByPrimaryKey(Integer id);

    List<Integer> selectBySeId(Integer seId);

    List<RoundPO> selectBySe(Integer seId);


    int updateByPrimaryKeySelective(RoundPO record);

    int updateByPrimaryKey(RoundPO record);
}
