package com.monkeyframework.ums.server.collector.controller;

import com.monkeyframework.rest.annotation.ServiceMethod;
import com.monkeyframework.rest.annotation.ServiceMethodBean;
import com.monkeyframework.ums.server.collector.request.PushPolicyQueryRequest;
import com.monkeyframework.ums.server.collector.response.PushPolicyQuery;
import com.monkeyframework.ums.server.collector.response.PushPolicyQueryResponse;

/**
 * <pre>
 * 功能说明：
 * </pre>
 * 
 * @author Stone
 * @version 1.0
 */
@ServiceMethodBean
public class PushPolicyQueryController extends BaseController {

	//private static Logger logger = Logger.getLogger(UsingLogController.class);
	
	@ServiceMethod(method = "/ums/pushpolicyquery")
	public Object pushpolicyquery(PushPolicyQueryRequest request) {
		PushPolicyQueryResponse response = new PushPolicyQueryResponse();
		PushPolicyQuery reply = new PushPolicyQuery();
		reply.setAutoGetLocation(1);
		reply.setFileSize(1);
		reply.setIntervalTime(1);
		reply.setReportPolicy(1);
		reply.setSessionMillis(30);
		reply.setUpdateOnlyWifi(0);
		response.setReply(reply);
		return response;
	}

}