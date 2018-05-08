package com.monkeyframework.ums.server.collector.controller;

import com.monkeyframework.rest.annotation.ServiceMethod;
import com.monkeyframework.rest.annotation.ServiceMethodBean;
import com.monkeyframework.ums.server.collector.request.AppUpdateRequest;
import com.monkeyframework.ums.server.collector.response.ApplicationUpdate;
import com.monkeyframework.ums.server.collector.response.ApplicationUpdateResponse;

/**
 * <pre>
 * 功能说明：
 * </pre>
 * 
 * @author Stone
 * @version 1.0
 */
@ServiceMethodBean
public class AppUpdateController extends BaseController {

	//private static Logger logger = Logger.getLogger(UsinglogController.class);

	@ServiceMethod(method = "/ums/appupdate")
	public Object appupdate(AppUpdateRequest request) {
		ApplicationUpdateResponse response = new ApplicationUpdateResponse();
		ApplicationUpdate reply = new ApplicationUpdate();
		reply.setDescription("test");
		reply.setVersionName("2.0.0");
		reply.setFileUrl("222222222222222222");
		reply.setFlag(0);
		response.setReply(reply);
		return response;
	}

}