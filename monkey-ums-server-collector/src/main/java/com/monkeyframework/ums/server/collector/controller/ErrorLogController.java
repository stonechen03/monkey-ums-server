package com.monkeyframework.ums.server.collector.controller;

import com.monkeyframework.rest.AbstractRestRequest;
import com.monkeyframework.rest.annotation.ServiceMethod;
import com.monkeyframework.rest.annotation.ServiceMethodBean;
import com.monkeyframework.rest.response.SuccessResponse;


/**
 * <pre>
 * 功能说明：
 * </pre>
 * 
 * @author Stone
 * @version 1.0
 */
@ServiceMethodBean
public class ErrorLogController extends BaseController {

	//private static Logger logger = Logger.getLogger(ErrorLogController.class);

	@ServiceMethod(method = "/ums/errorlog")
	public Object eventLog(AbstractRestRequest request) {
		SuccessResponse response = new SuccessResponse();
		String ip = request.getRestRequestContext().getIp();
		String content = request.getRestRequestContext().getContent();
		messageProducer3.sendText("topic_errorlog", ip, content);
		return response;
	}

}