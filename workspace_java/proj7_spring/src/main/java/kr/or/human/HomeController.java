package kr.or.human;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
// @Controller 라는 역할을 주는 것
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	// Controller에 등록되어 있는 애들이 멥핑에 주소를 주고 실행시킬 수 있다 
	// method = RequestMethod.GET은 메소드마다 다 붙일수 있음
	public String home(Locale locale, Model model) {
		// @RequestMapping을 사용하면 메소드와 전달인자 에 다 들어갈 수 있다 
		// 배열안에 있는 것들을 알아서 실행시켜줌
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
