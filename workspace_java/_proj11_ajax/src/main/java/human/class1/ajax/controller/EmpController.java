package human.class1.ajax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import human.class1.ajax.sevice.EmpService;

@Controller
public class EmpController {

	@Autowired
	EmpService empService;
	
	@RequestMapping("/listEmp")
	@ResponseBody
	public List listEmp(Model model) {
		List list = empService.listEmp();
		model.addAttribute("empList", list);
		System.out.println("list.size(): "+ list.size());
		
		return list;
	}
	@RequestMapping("/emp")
	public String emnp() {
		return "emnp";
	}
	
}
