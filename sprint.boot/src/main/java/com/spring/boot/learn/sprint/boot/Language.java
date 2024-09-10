package com.spring.boot.learn.sprint.boot;

public class Language {
	private long id;
	private String languageName;
	private String languageType;

	public Language(long id, String languageName, String languageType) {
		super();
		this.id = id;
		this.languageName = languageName;
		this.languageType = languageType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public String getLanguageType() {
		return languageType;
	}

	public void setLanguageType(String languageType) {
		this.languageType = languageType;
	}

	@Override
	public String toString() {
		return "Language [id=" + id + ", languageName=" + languageName + ", languageType=" + languageType + "]";
	}
}
