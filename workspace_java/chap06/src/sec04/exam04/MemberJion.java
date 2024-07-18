package sec04.exam04;

public class MemberJion {
	
	/*
	 * 오버로딩 
	 * 1. System.out.println처럼 전달인자를 신경쓰지 않게하기 위함
	 * 2. 전달인자를 너무 많고 기본값을 입력하는 경우가 빈번할때 
	 * 	  전달이자를 줄이는 목적으로도 사용함
	 */

	void join(String id, 
			  String pw, 
			  String address, 
			  int age, 
			  int gender) {
		System.out.println("아이디 : "+ id);
		System.out.println("비밀번호 : "+ pw);
		System.out.println("주소 : "+ address);
		System.out.println("성별 : "+ gender);
	}
	void join(String id, String pw ) {
		join(id, pw, null, -1, -1);
    }
//	void join(String pw, String id ) {
//		join(id, pw, null, -1, -1);
//		// 전달인자 위치를 변경해도 안됨 
//		// 위랑 아래가 전달인지가 같기 때문에
//    }
}	