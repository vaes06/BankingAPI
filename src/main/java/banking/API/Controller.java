package banking.API;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class Controller {
	
	@RequestMapping("/")
	public String index() {
		return "Congratulations from Controller.java";
	}

}
