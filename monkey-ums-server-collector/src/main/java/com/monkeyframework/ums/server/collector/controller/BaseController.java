package com.monkeyframework.ums.server.collector.controller;

import javax.annotation.Resource;

import com.monkeyframework.jms.core.producer.MessageProducer3;
import com.monkeyframework.rest.annotation.ServiceMethodBean;

/**
 * <pre>
 * 功能说明：
 * </pre>
 * 
 * @author Stone
 * @version 1.0
 */
@ServiceMethodBean
public class BaseController {

	/*@Resource
	protected MessageProducer2 messageProducer2;*/
	
	@Resource
	protected MessageProducer3 messageProducer3;
	
}