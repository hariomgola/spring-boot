package com.springboot.fullstack.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	// creating the authentication service
	private AuthenticationService authenticationService;

	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	/**
	 * @RequestMapping("login") public String login(@RequestParam String name,
	 * ModelMap model) { model.put("name", name); return "login"; }
	 */

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String afterLoginPage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if (authenticationService.authenticate(name, password)) {
			model.put("name", name);
			return "welcome";
		}
		model.put("loginError", """
				Please Provide the Correct UserName and Password.
				Show me you are a WebDev and get the credential.
				""");
		return "login";
	}
}