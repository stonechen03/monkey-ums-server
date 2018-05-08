package com.monkeyframework.ums.server.storage.service;

import com.monkeyframework.ums.server.core.model.ClientData;

public interface ClientDataService {

	public void save(ClientData clientData, String ip);
}
