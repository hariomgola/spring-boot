package com.springboot.fullstack.learn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LearnController {

	@RequestMapping("return-string")
	@ResponseBody
	public String returnString() {
		return "Hello! I am String Directly returned";
	}

	@RequestMapping("return-html")
	@ResponseBody
	public String returnHtml() {
		String htmlPage = """
				<html>
				  <head>
				    <title> I am Directly from Java </title>
				  </head>
				  <body>
				     <h2> I am Directly from Java </h2>
				  </body>
				</html>
				""";
		return htmlPage;
	}

	@RequestMapping("return-jsp")
	public String returnJsp() {
		return "jspHtmlPage";
	}
}
