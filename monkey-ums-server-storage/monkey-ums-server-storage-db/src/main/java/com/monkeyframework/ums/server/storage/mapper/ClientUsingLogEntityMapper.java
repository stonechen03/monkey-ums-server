package com.monkeyframework.ums.server.storage.mapper;

import org.springframework.stereotype.Repository;

import com.monkeyframework.ums.server.core.entity.ClientUsingLogEntity;

@Repository
public interface ClientUsingLogEntityMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(ClientUsingLogEntity record);

    int insertSelective(ClientUsingLogEntity record);

    ClientUsingLogEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClientUsingLogEntity record);

    int updateByPrimaryKey(ClientUsingLogEntity record);
}