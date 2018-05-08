package com.monkeyframework.ums.server.storage.mapper;

import org.springframework.stereotype.Repository;

import com.monkeyframework.ums.server.core.entity.ErrorLogEntity;
import com.monkeyframework.ums.server.core.entity.ErrorLogEntityWithBLOBs;

@Repository
public interface ErrorLogEntityMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(ErrorLogEntityWithBLOBs record);

    int insertSelective(ErrorLogEntityWithBLOBs record);

    ErrorLogEntityWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ErrorLogEntityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ErrorLogEntityWithBLOBs record);

    int updateByPrimaryKey(ErrorLogEntity record);
}