package chap05;

public class RefExam {

	public static void main(String[] args) {
			//참 조
		int a;
//		System.out.println(a); //  값을 할당하지 않아서 결과가 안나옴
//		int b = a;
		
		String c = "김 소원"; // c : stack 김 소원 : heap
		// = 을 기준으로 오른쪽 먼저 실행
		// " 김 소원 "이 힙 (heap) 영역에 비어있는 번지에 들어간다
		// 스택 (stack) 영역의 c에 그 번지가 기록된다
		
		System.out.println( " c == null : "+ ( c == null)  ); // c의 값을 null로 주지 않아서 결과는 false
		System.out.println( " c != null : "+ ( c == null)  );
		
		
		c = null;  // 주소값을 비워서 연결 끊기
		System.out.println( "c : + c");
		System.out.println( " c == null : "+ ( c == null)  ); // c의 값을 null로 줘서 결과는 true
		System.out.println( " c != null : "+ ( c == null)  );
		
		String d;
		// 기본 타입과 마찬가지로
		// 값을 할당하지 않으면 사용할 수 없다
//		System.out.println(d);
		d = "김 소원";
		c = "김 소원"; 
		System.out.println( c == d ); //비교시 결과는 true
		// 이건 String 특별대우 
		
		c = new String("김 소원"); // 새로운 주소에 할당
		System.out.println( c == d); // 결과 : false
		// c가 가지고 있는 주소와 d의 주소값이 다르다
		
		System.out.println( "c.equals(d) : "+ c.equals(d) ); // "김".equals도 사용 가능 equals(비교)
		
		c = null; 
//		System.out.println( "c.equals(d) : "+ c.equals(d) ); // c가 null이여서 결과가 안나옴 (에러남)
		String e =  c + "abc";
		System.out.println(e);
//		System.out.println( c + "abc");
				
		
	}

}
