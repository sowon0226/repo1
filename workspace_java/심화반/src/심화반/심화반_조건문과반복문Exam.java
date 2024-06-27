package 심화반;

public class 심화반_조건문과반복문Exam {

	public static void main(String[] args) {
		
//		if("조건식") {
//			실행문 A / 참인 경우 else는 실행안됨
//		} else {
//			실행문 B / 실행문 A가 거짓인 경우 else가 실행됨
//		}

		// if문
		int a = 10;
		boolean b = a < 5; //boolean은 <>= 만 들어갈 수 있음 (크다,작다,같다)
//		if(a > 5) {
		if(a < 5) {
			// a < 5는 a가 5보다 크거나 같다라고 적은 수 있다
			// if (b == true) 강조하는것 (무조건 true가 나와야함)
			// if()안에 들어갈 수 있는 것은 boolean만 들어갈 수 있음
			// else로 묶여있으면 if 바로 아래 조건이 참이면 실행 후 아래로 안내려감
			System.out.println(a + "은(는) 5보다 작습니다");
		} else if (a >=5 && a < 15) { 
			System.out.println(a + "은(는) 15보다 작습니다");
		} else if (a < 25) {
			System.out.println(a + "은(는) 25보다 작습니다");
		}
		// else는 위에 조건문과 연관이 있으면 사용함
		// 위에 조건이 거짓으라는 조건이 깔려 있어야만 else가 실행
		
		if(a < 5) { // if만 있는 경우 각각 실행 됨
			System.out.println(a + "은(는) 5보다 작습니다");
		} if (a >=5 && a < 15) { 
			System.out.println(a + "은(는) 15보다 작습니다");
		} if (a >=5 && a < 25) {
			System.out.println(a + "은(는) 25보다 작습니다");
		}
		
	
		boolean a1 = true;
		boolean a2 = true;
		boolean a3 = false;
		
		// &&는 (그리고) 둘 중 하나가 false면 실행이 끝남 (false만 찾아감)
		// &&만 있는 경우 false가 나오면 그 뒤로는 쳐다도 안봄
		System.out.println( a1 && a3 && a2);
//		String b1 = "치킨";
		String b1 = null;
		if (b1 != null) { // b1이 null아니여야만 실행이 되는데 b1이 null이여서 거짓
			System.out.println(123);
			
			if(b1.length() > 4 ) {
				System.out.println( b1);
		   }
		}
		
		if (b1 != null && b1.length() > 4) {
		System.out.println( b1 );
		}
		// ||는 (또는) 참이여도 되고 거짓이여도 되고 (true만 찾아감)
		// ||는 true를 만나면 더이상 실행하지 않음
		System.out.println( a1 || a3 || a2);
		
		// ()가 없을 때는 || &&가 같이 나오면 &&를 먼저 비교 후 ||를 비교
		System.out.println( false || true && true );
		// ()가 있을 때는 ()를 먼저 해줘야함
		System.out.println( (false || true) && true );
		
//		if( 3 < a < 5) {
//		if( (3 < 4) < 5) {
//	    //  true < 5는 비교가 될 수 없다
//		// boolean이랑 int랑 비교가 안된다는 얘기임	
//		}
//		if( 30 < a < 50) {
		// 둘다 사용 가능함
		a = 40;
		if (30 < a && a < 50) {
			System.out.println(a);
		}
		if ( 30 < a) {
			if( a < 50) {
				System.out.println(a);
			}
		}
		// Math.random()
		// double을 int로 바꿀 때 뒤에 소수 점은 버려짐
		
		
		
		
	}
	
}
