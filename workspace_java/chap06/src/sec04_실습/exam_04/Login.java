package sec04_실습.exam_04;

public class Login {
	String id;
	String pw;
	boolean check = false;
	/* 
	 * 문제4
	 * 로그인
	 * 생성자로 id, pw를 받아서 저장해 놓음 (회원가입)
	 * login (아이디, 패스워드) 실행하면
	 * 결과로 생성자에서 id,pw랑 같은지 돌려줌
	 * login메소드 안에서 만약 같으면 "메인페이지" 출력하고 true 돌려둠
	 * 다르면 "로그인 화면으로 돌아감" 출력
	 */

//	void join(String id, 
//			  String pw) {
//		System.out.println("아이디 : "+ id);
//		System.out.println("비밀번호 : "+ pw);
//		Id =id;
//		Pw = pw;
//	}
	Login(String a, String b){ // 저장
		id = a;
		pw = b;
		System.out.println(a+b);
	}
	void 실행(String a, String b){
		if(a == id && b == pw) {
			System.out.println("메인페이지");
			check = true;
		}else {
			System.out.println("로그인 화면으로 돌아감");
			check = false;
		}
	}
//	String id;
//	String pw;
//	
//	Login(String id, String pw){
//		this.id = id;
//		this.pw = pw;
//	}
//	
//	/*
//	 * 생성자로 id, pw를 받아서 저장해 놓음 (회원가입)
//		login(아이디, 패스워드) 실행하면
//		login메소드 안에서...
//		만약 같으면 "메인페이지" 출력하고 true 돌려줌
//		다르면 "로그인 화면으로 돌아감" 출력하고 false 돌려줌
//	 */
//	boolean login(String id, String pw) {
//		boolean result = false;
//		if(this.id.equals(id) && this.pw.equals(pw)) {
//			System.out.println("메인페이지로 이동" );
//			result = true;
//		} else {
//			System.out.println("로그인 화면으로 돌아감");
//			result = false;
//		}
//		
//		return result;
//	}
}

