package org.zerock.w1.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("") // 어노테이션이 붙어있으면 톰켓이 다 돌아감
public class CheckFilter implements Filter {
// 필터도 같이 로딩 됨
    public CheckFilter() {     
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 서블릿 실행 전 처리
		System.out.println("doFilter 실행 전");
		long before = System.currentTimeMillis();// 들어가는 시간
		
		
		
		// 한글 인코딩
		// 내 서버로 들어오는 모든 파일을 한글로 인코딩 함
		request.setCharacterEncoding("utf-8");
		
		// Filter의 doFilter에서의 전달인자는 우리가 사용했던
		// HttpServletRequest를 부모형태로 캐스팅한 변수를 사용하고 있어서
		// 필요한 메소드 사용을 위해 다시 자식 형태로 형변환
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		// 주소에 따라서 그 주소가 있는지 없는지를 확인하는 것임
		System.out.println("req.getServletPath() : " + req.getServletPath());
		
		
		// 그냥 세션이 없어도 통과하는 주소	
		// 세션이 있어야 통과하는 주소
		
		
		if(isExclude(req.getServletPath())) {// isExclude에 던져주면 ture/false가 나옴
			System.out.println("세션이 없이 진행");
			
			if(req.getServletPath().indexOf("/assets") == -1) {
			response.setContentType("text/html; charset=utf-8;");// 나가는 것도 한글로 인코딩해줌
			}
			chain.doFilter(request, response);
		}else if("/session/mypage".equals(req.getServletPath())) {
			// 세션을 점검해서 
			HttpSession session = req.getSession();// 자식요소로 바꿔놓은 곳에서 빼와서
			Boolean isLogon = (Boolean)req.getAttribute("isLogon");
			if(isLogon != null && isLogon == true) { // 성공여부를 묻는다
				// 로그인이 되어 있는 경우에만 통과
				System.out.println("로그인 되어 있으면 통과");
				chain.doFilter(request, response);// "/session"로 돌려 보내서 로그인 페이지가 나옴
			}else {
				System.out.println("로그인 안되어 있으면 통과 불가");
				// 그렇지 않으면 다른 페이지로 이동
				resp.sendRedirect(req.getContextPath() +"/session");
			}
		}

		
		System.out.println("getServletPath : " + req.getServletPath());
		
		
		// 서블릿 실행 (doGet같은거)
		chain.doFilter(request, response);
		
		// 서블릿 실행 후
		System.out.println("doFilter 실행 후");
		long after = System.currentTimeMillis(); // 나오는 시간(걸린시간을 보고 나옴)
		System.out.println("걸린 시간 : " + (after - before));
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("필터 init 실행");
	}

	private boolean isExclude(String servletPath) { // 실무에서 쓰는 방식
		if("/login".equals(servletPath) 
				|| "/logout".equals(servletPath) 
				|| !"/session/mypage".equals(servletPath)
		) {
			return true;
		}else {
			return false;
		}
	}
}
