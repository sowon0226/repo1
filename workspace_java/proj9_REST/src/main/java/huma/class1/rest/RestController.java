package huma.class1.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/human")
@ResponseBody
//@RestController
public class RestController {

	@RequestMapping("/rest/test1")	
	public int test1() {
		return 100;
	}
	@RequestMapping("/rest/test2")	
	public String test2() {
		return "ajax";
	}
}
