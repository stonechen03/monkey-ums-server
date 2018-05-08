package com.monkeyframework.ums.server.storage.dao;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.monkeyframework.ums.server.core.entity.ClientUsingLogEntity;
import com.monkeyframework.ums.server.storage.mapper.ClientUsingLogEntityMapper;

@Repository("clientUsingLogDao")
public class ClientUsingLogDao {

	@Resource
	private ClientUsingLogEntityMapper clientUsingLogEntityMapper;
		
	public void save(ClientUsingLogEntity record) {
		record.setInsertdate(new Date());
		clientUsingLogEntityMapper.insert(record);
	}
}
