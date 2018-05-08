package com.monkeyframework.ums.server.storage.service.impl;

import javax.annotation.Resource;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.stereotype.Service;

import com.monkeyframework.ums.server.core.entity.ClientUsingLogEntity;
import com.monkeyframework.ums.server.core.model.UsingLog;
import com.monkeyframework.ums.server.storage.dao.ClientUsingLogDao;
import com.monkeyframework.ums.server.storage.service.ClientUsingLogService;
import com.monkeyframework.ums.server.storage.utils.Contants;

@Service("clientUsingLogService")
public class ClientUsingLogServiceImpl implements ClientUsingLogService {
		
	@Resource
	private ClientUsingLogDao clientUsingLogDao;
	
	public void save(UsingLog log) {
		try {
			ClientUsingLogEntity record = new ClientUsingLogEntity();

			record.setSessionId(log.getSession_id());
			record.setStartMillis(DateUtils.parseDate(log.getStart_millis(), Contants.pattern));
			record.setEndMillis(DateUtils.parseDate(log.getEnd_millis(), Contants.pattern));		
			record.setDuration(Integer.parseInt(log.getDuration()));
			record.setActivities(log.getActivities());
			record.setAppkey(log.getAppkey());
			record.setVersion(log.getVersion());
			record.setDeviceid(log.getDeviceid());
			record.setUseridentifier(log.getUseridentifier());
			record.setLibVersion(log.getLib_version());
			
			clientUsingLogDao.save(record);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}