package customerconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerConfigurationController {
	@Autowired
	private CustomerServiceConfiguration config;

	@RequestMapping("/customer-config")
	public CustomerServiceConfiguration getconfig() {
		return config;
	}
}
