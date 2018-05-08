package com.monkeyframework.ums.server.storage.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.monkeyframework.ums.server.core.entity.EventDefinationEntity;

@Repository
public interface EventDefinationExtendMapper {

	public EventDefinationEntity selectByProductkeyAndEventIdentifier(@Param("productkey") String productkey,
			@Param("eventIdentifier") String eventIdentifier);
}
