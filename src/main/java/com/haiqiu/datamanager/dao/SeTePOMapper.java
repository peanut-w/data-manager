package com.haiqiu.datamanager.dao;

import com.haiqiu.datamanager.poentity.SeTePO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SeTePOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SeTePO record);

    int insertSelective(SeTePO record);

    SeTePO selectByPrimaryKey(Integer id);

    SeTePO selectBySeAndTeId(@Param("seasonId") Integer seId, @Param("teamId") Integer teId);

    List<Integer> selectTeBySe(@Param("seasonId") Integer seId);

    int updateByPrimaryKeySelective(SeTePO record);

    int updateByPrimaryKey(SeTePO record);
    int deleteAll();
}
