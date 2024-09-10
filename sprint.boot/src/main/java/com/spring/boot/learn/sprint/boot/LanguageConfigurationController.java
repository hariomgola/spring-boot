package com.spring.boot.learn.sprint.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageConfigurationController {
	@Autowired
	private LanguageServiceConfiguration languageServiceConfiguration;

	@RequestMapping("/language-configuration")
	public LanguageServiceConfiguration showAllLanguage() {
		return languageServiceConfiguration;
	}
}
