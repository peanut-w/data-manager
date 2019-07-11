package com.haiqiu.datamanager.dao;

import com.haiqiu.datamanager.poentity.FederationPO;

public interface FederationPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FederationPO record);

    int insertSelective(FederationPO record);

    FederationPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FederationPO record);

    int updateByPrimaryKey(FederationPO record);
}
