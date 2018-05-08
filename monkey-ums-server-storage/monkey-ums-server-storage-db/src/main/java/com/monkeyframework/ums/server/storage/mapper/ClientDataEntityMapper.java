package com.monkeyframework.ums.server.storage.mapper;

import org.springframework.stereotype.Repository;

import com.monkeyframework.ums.server.core.entity.ClientDataEntity;

@Repository
public interface ClientDataEntityMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(ClientDataEntity record);

    int insertSelective(ClientDataEntity record);

    ClientDataEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClientDataEntity record);

    int updateByPrimaryKey(ClientDataEntity record);
}