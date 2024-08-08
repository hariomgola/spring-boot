package com.learn_spring_boot.spring_boot.constroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Language {
	private long id;
	private String technologyName;
	private String technologyType;

	public Language(long id, String technologyName, String technologyType) {
		super();
		this.id = id;
		this.technologyName = technologyName;
		this.technologyType = technologyType;
	}

	public long getId() {
		return id;
	}

	public String getTechnologyName() {
		return technologyName;
	}

	public String getTechnologyType() {
		return technologyType;
	}
}

@RestController
public class LanguageController {

	@RequestMapping("/languages")
	public List<Language> returnAllCourses() {
		return Arrays.asList(new Language(1, "Angular", "frontEnd"), new Language(1, "React", "frontEnd"),
				new Language(3, "Java", "BackEnd"));
	}
}
