package com.haiqiu.datamanager.dao;

import com.haiqiu.datamanager.poentity.PersonDetailPO;

public interface PersonDetailPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PersonDetailPO record);

    int insertSelective(PersonDetailPO record);

    PersonDetailPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PersonDetailPO record);

    int updateByPrimaryKey(PersonDetailPO record);
}
