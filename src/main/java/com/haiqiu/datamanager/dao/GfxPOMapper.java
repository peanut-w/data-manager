package com.haiqiu.datamanager.dao;

import com.haiqiu.datamanager.poentity.GfxPO;

public interface GfxPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GfxPO record);

    int insertSelective(GfxPO record);

    GfxPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GfxPO record);

    int updateByPrimaryKey(GfxPO record);

    int deleteAll();
}
