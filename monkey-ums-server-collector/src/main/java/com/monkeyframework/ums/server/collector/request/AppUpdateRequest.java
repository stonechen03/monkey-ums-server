package com.monkeyframework.ums.server.collector.request;

import com.monkeyframework.rest.AbstractRestRequest;

public class AppUpdateRequest extends AbstractRestRequest {

	private String appKey;
	private String versionCode;

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}

}
