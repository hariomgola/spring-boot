package com.spring.boot.learn.sprint.boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {
	@RequestMapping("/languages")
	public List<Language> showAllLanguage() {
		return Arrays.asList(new Language(1, "JavaScript", "FrontEnd"), new Language(2, "Java", "BackEnd"),
				new Language(3, "Angular", "FrontEnd"));
	}
}
