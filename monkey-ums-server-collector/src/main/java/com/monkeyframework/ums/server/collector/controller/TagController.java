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
public class TagController extends BaseController {

	//private static Logger logger = Logger.getLogger(TagController.class);

	@ServiceMethod(method = "/ums/tag")
	public Object postEvent(AbstractRestRequest request) {
		SuccessResponse response = new SuccessResponse();
		String ip = request.getRestRequestContext().getIp();
		String content = request.getRestRequestContext().getContent();
		messageProducer3.sendText("topic_tag", ip, content);
		return response;
	}

}