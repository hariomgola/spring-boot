package com.learn_spring_boot.spring_boot.constroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ConfigurationProperties(prefix = "region-service")
@Component
class RegionService {
	private String url;
	private String username;
	private String key;
	private String password;

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getKey() {
		return key;
	}

	public String getPassword() {
		return password;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

@RestController
public class RegionController {
	@Autowired
	private RegionService regionService;

	@RequestMapping("/region")
	public RegionService RegionServiceConfiguration() {
		return regionService;
	}
}
