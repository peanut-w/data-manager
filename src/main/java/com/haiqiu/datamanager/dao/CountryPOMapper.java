package com.haiqiu.datamanager.dao;

import com.haiqiu.datamanager.poentity.CountryPO;

import java.util.List;

public interface CountryPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CountryPO record);

    int insertSelective(CountryPO record);

    CountryPO selectByPrimaryKey(Integer id);

    List<CountryPO> selectAll();

    int updateByPrimaryKeySelective(CountryPO record);

    int updateByPrimaryKey(CountryPO record);
}
