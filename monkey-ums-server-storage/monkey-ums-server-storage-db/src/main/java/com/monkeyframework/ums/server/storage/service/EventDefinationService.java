package com.monkeyframework.ums.server.storage.service;

import com.monkeyframework.ums.server.core.entity.EventDefinationEntity;

public interface EventDefinationService {

	public EventDefinationEntity getByProductkeyAndEventIdentifier(String productkey, String eventIdentifier);
	
	public EventDefinationEntity gainByProductkeyAndEventIdentifier(String productkey, String eventIdentifier);

}
