package huma.class1.rest;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

	/*
	 * "/rest/ajax.view" <<<<<
	 * "/rest/ajax
	 */
	@RequestMapping(value = "/ajax.view", method = RequestMethod.GET) // ajax.jsp로 보내는것
	public String ajaxView() {
		return "ajax";
	}
	// @RequsetBody : post로 보낸 json을 처리
	@RequestMapping(value = "/ajax",  method = RequestMethod.POST) // ajax에서 받아 온 것을 html로 변환
	public String ajax( 
			
			@RequestParam(value ="ename", required=false)String ename,
			@ModelAttribute EmpDTO dto2,
			
			@RequestBody EmpDTO dto
			) {
		// json으로 보낸건 @RequesParam 또는 request.getParameter로 받을 수 없다
		System.out.println("ename" + ename);
		System.out.println("dto2" + dto2);
		System.out.println("dto" + dto);
		return "ajax";
	}
//	@ResponseBody : 그냥 값이나 json으로 리턴해줌
	@RequestMapping(value = "/ajax/String",  method = RequestMethod.POST)
	@ResponseBody
	public String ajaxString( 
			@RequestBody EmpDTO dto
	) {
		
		System.out.println("dto" + dto);
		return "human";
	}
	@RequestMapping(value = "/ajax/dto",  method = RequestMethod.POST)
	@ResponseBody
	public EmpDTO ajaxDto( 
			@RequestBody EmpDTO dto
	) {
		
		System.out.println("dto" + dto);
		return dto;
	}
	@RequestMapping(value = "/ajax/list",  method = RequestMethod.POST)
	@ResponseBody
	public List ajaxList( 
			@RequestBody EmpDTO dto
	) {
		
		System.out.println("dto" + dto);
		
		List list =  new ArrayList();
		list.add(dto);		
		list.add(dto);		
		list.add(dto);		
	
		return list;
	}
	@RequestMapping(value = "/ajax/forward", method = RequestMethod.GET) // ajax.jsp로 보내는것
	public String ajaxFoward() {
		return "forward:/ajax.view";
	}
	@RequestMapping(value = "/ajax/redirect", method = RequestMethod.GET) // ajax.jsp로 보내는것
	public String ajaxRedirect() {
		return "redirect:/ajax.view";
	}
	@RequestMapping("/ajax/notice/{num}/static/{str}")
	@ResponseBody
	public int notice(
			@PathVariable("num")
			int number,
			
			@PathVariable("str") String str1,
			
			HttpServletRequest request
			) {
		
		System.out.println(request.getParameter("num"));
		
		System.out.println("number :"+ number);
		System.out.println("str1 :"+ str1);
		
		return number;
	}
}
