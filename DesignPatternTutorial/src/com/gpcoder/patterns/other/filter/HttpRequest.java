package com.gpcoder.patterns.other.filter;

import lombok.Data;

@Data
public class HttpRequest {

	private String clientIp;
	private String targetUrl;
}
