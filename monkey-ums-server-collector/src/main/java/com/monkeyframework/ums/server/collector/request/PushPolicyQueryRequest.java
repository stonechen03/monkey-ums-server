package com.monkeyframework.ums.server.collector.request;

import com.monkeyframework.rest.AbstractRestRequest;

public class PushPolicyQueryRequest extends AbstractRestRequest {

	private String appKey;

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

}
