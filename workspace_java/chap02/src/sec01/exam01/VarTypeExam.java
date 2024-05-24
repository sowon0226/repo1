package sec01.exam01;

public class VarTypeExam {

	public static void main(String[] args) {
	
		byte b =127;
//  	b =128
		
		char c = 97;
		System.out.println(c);
		c = 97+5;
		c = 'c' + 5;
		System.out.println(c);
		char c1 = 'a'; // 문자 하나만 저장하눈 용도, 홀따옴표'로 감싼다
		
		long balance = 3000000000L;// 명확하게 long으로 지정하려면
								   // 숫자 뒤에 L 또는 l을 붙여준다
		// byte b21=1L;
		
		// |n 을 쓰면 다음 줄로 넘어감
		// |t 는 탭만큼 띄움 
		String s = "문자열";
		System.out.println(s);
		
		float f = 0.12345690123456789F;
		//float은 소수점 7번째 자리까지 정확함
		System.out.println(f);
		double d =0.12345690123456789;
		// double은 소수점 16번째 자리까지 정확함
		System.out.println(d);
		
		boolean b1 = true;
		boolean b2 = false;
		
		// 내가 운전하는 자동차가 있다 없다
		boolean car = true;
		//우리집에 있는 스마트폰의 수
		int p = 5;
		//내 이름
		String i = "내이름";
		//1평은 3.3제곱미터 입니다. 5평에 대한 제곱미터 값
		//doule py =3.3;
		
		
				
		
	}

}
