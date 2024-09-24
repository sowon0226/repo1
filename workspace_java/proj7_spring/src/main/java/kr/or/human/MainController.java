package kr.or.human;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


//@Target({ElementType.TYPE}) : 클래스에서만 실행가능
//@Retention(RetentionPolicy.RUNTIME) : 실행 되는 동안에도 살아있음 
//@Documented : 
//@Component : 스프링에게 Bean으로 등록시키는 역할을 한다.
// Controller Bean : Spring이 생성 할 수 있는 Class로 등록
@Controller
// ip : port/ context_path/
// Class에 붙은 @RequestMapping은 HandlerMapping이 처리합니다
// ip : port/ context_path/sub/**
// 이 클래스에서 반복되는 첫 주소를 한번에 지정할 때 사용
@RequestMapping("/sub")
public class MainController {

	// 메소드에 적용한 @RequestMapping은 HandlerAdaper가 처리합니다.
	@RequestMapping("/main1.do")
	public ModelAndView main1() {
		System.out.println("main1 실행");
		
		// ViewResolver로 보내는 객체
		ModelAndView mav = new ModelAndView();
		// jsp의 조합을 위한 이름
		//forward로 이동하게 됨
		mav.setViewName("main");
		
		// 생성과 동시에 적어도 실행된다
		// viewname 생서자 안에 넣어도 됨
	    //ModelAndView mav = new ModelAndView("main");

		
		return mav;
	}
	@RequestMapping("/test/main2.do")
	public ModelAndView main2() {
		System.out.println("main2 실행");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		
		// 마치 request.setAttribute 처럼 담을 수 있는 방법
		mav.addObject("msg", "근승이 조심 사람도 물어요");
		
		return mav;
	}
	
	// 전달인자가 value 하나일때는 value라는 글씨를 생략 할 수 있다 
	// 두개 이상 값을 넣을 때는 {}안에 넣는다
	// value는 url 패턴을 뜻한다
	// method는 접근 방식을 제안 함
	// 			적은 것만 들어 올 수 있음 
	// 			method를 생략하면 모든 방식 허용 
	@RequestMapping(
		value = {"/test/main3.do", "/test/main4.do"},
		method = {RequestMethod.POST, RequestMethod.GET}
	)
	public ModelAndView main3() {
		System.out.println("main2 실행");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		
		// 마치 request.setAttribute 처럼 담을 수 있는 방법
		mav.addObject("msg", "main3 메소드 실행");
		
		return mav;
	}
	// url 주소가 같으면 부팅 시 예외 발생
//	@RequestMapping("/test/main2.do")
//	public ModelAndView main4() {
//		System.out.println("main2 실행");
//		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("main");
//		
//		// 마치 request.setAttribute 처럼 담을 수 있는 방법
//		mav.addObject("msg", "근승이 조심 사람도 물어요");
//		
//		return mav;
//	}
	@RequestMapping(value ="/test/main5.do", method=RequestMethod.GET)
	//@GetMapping("/test/main7.do")
	public ModelAndView main5() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("msg", "근승이 조심 사람도 물어요");
		
		return mav;
	}
	@RequestMapping(value ="/test/main5.do", method=RequestMethod.POST)
	//@PostMapping("/test/main7.do")
	public ModelAndView main6() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("msg", "근승이 조심 사람도 물어요");
		
		return mav;
	}
	//@RequestMapping(value ="/test/main5.do", method=RequestMethod.PUT)을 축약해서  @PutMapping("/test/main7.do")으로 쓸 수있다
	 @PutMapping("/test/main7.do")
		public ModelAndView main7() {
			ModelAndView mav = new ModelAndView();
			mav.setViewName("main");
			mav.addObject("msg", "근승이 조심 사람도 물어요");
			
			return mav;
		}
	 @DeleteMapping("/test/main8.do")
		public ModelAndView main8() {
			ModelAndView mav = new ModelAndView();
			mav.setViewName("main");
			mav.addObject("msg", "근승이 조심 사람도 물어요");
			
			return mav;
		}
}
