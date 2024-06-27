package 심화반;

public class 심화반_for문Exam {

	public static void main(String[] args) {
//		// for( 초기화식 (한번만 실행됨) ; false가 아닐 때  ;  ){
//		//
//		//}  - 주석을 잘 적어야함
//		
//		int a = 1;  // a를 초기화 했다
////		int c = 0;
//		// 딱 세번만 실행하고 싶엉
//		
//		// 첫번째 실행
//		a = a + 10;
//		//a += 10;  위에 공식과 같은 말
//		System.out.println(a);
////		c++;
//			
//		if(a <= 21) {
//		// 첫번째와 같은 코드를 두번째 실행
//		a = a + 10;
//		System.out.println(a);		
//		}
//		
//		if(a <= 31) {
//		// 계속 같은 코드를 세번째 실행
//		a = a + 10;
//		System.out.println(a);		
//		}
//		
		// 첫번째 장소 : 초기화식, 처음에 딱 한번만 실행됨
		// 두번째 장소 : 조건식 ,거짓이 아닐 때 반복시키는 조건 (false가 아닐 때)
		//          : 처음부터 조건이 맞아야 실해됨
		// 세번째 장소 : 증감식 자리, 사실은 그냥 실행문 끝에 무조건 실행해야 하는
		//					   코드를 넣는 곳
//		int b = 1;
//		for(   ; b <= 31 ;    ) {	}
				
//		for(int b = 1; b <= 31 ; System.out.println(123) ) {	
		for(int b = 2; b <= 31 ; b = b + 10 ) {	// ++b나 b++앞에 쓰나 뒤에 쓰나 한줄이며 증가함
			System.out.println(b);
		}
		// 0 부터 3까지 더하는 법?
		// 초기화식을 밖으로 빼면 {} 밖에서도 출력이 가능하다
		int i=0;
		for(  ;  i < 3; i++) {
			
		}
		System.out.println(i);
		
		// 출력은 반복문 안에서만 출력이 가능함
		// for문 밖에 초기화식이 없으므로
		for(int i2 = 1; i2 <=100; i2++) {
					// 참거짓말 들어갈 수 있다 boolean
			int sum = 0;
			sum = sum + i2;
			 System.out.println(sum);
		}
		// 이방법은 안쓰는게 좋다
		int sum = 0;
		boolean isTrue = true;
		for(int i2 = 1; isTrue; i2++ ) {
			isTrue = i2 <=100;
			sum = sum +i2;
			System.out.println(sum);
		}
			
		for(int i3=3; i3<=7; i3++) { // i3<8로도 사용가능
			System.out.println(i3);
		}
		int a3 =8;
		for(int i3=3; i3<=a3; i3++) { 
			System.out.println(i3);
		}
		System.out.println("--------");
		for(int i3=1; i3<=10; i3++) { 
			System.out.println(++i3);
		}
		for(int i3=2; i3<=10; i3+=2) { 
			System.out.println(i3);
		}
		// 시작조건
		// 종료조건
		// 반복되는거 : 컨트롤 + v하고 안바꾸는거
		// 반복되지 않는 것의 규칙
		// 종료조건 : 개수가 정해진 경우 for
		//		   언제 끝날지 자 모를 때 while
		System.out.println(2);
		System.out.println(4);
		System.out.println(4+2);
		System.out.println(4+2+2);
	
		for(int i4=2; i4 <=10; i4=i4+2) {
			System.out.println(i4);
		}
		
		String l = "언니";
		String o = "항상";
		String v = "응원해";
		String e = "화이팅";
		
		System.out.println(l+o+v+e);
		int b = 2;
		if(b <= 10) {
			System.out.println(b);
			b = b + 2;
		}
		if(b <= 10) {
			System.out.println(b);
			b = b + 2;
		}
		if(b <= 10) {
			System.out.println(b);
			b = b + 2;
		}
		if(b <= 10) {
			System.out.println(b);
			b = b + 2;
		}
		System.out.println("--------");
		// 배웠는데 금쪽이가 되었네
		// 총 합 구하는 방법
		// 결과값을 반복문 밖에서 구하면
		int sum2=1;
		for(int c=2; c<=10; c= c+2) {
//			sum2= sum2 +c;
//			System.out.println(sum2);
			System.out.println(c);
		}
		//System.out.println(sum2);
		System.out.println("--------------------------------------------------");
		// 3부터 100까지의 짝수를 구하기
		// 
		int count=0;
		for(int c=3; c<=100; c++) { // % 나머지를 뜻함
			if(c%2==0) { // 2로 나눴을 때 나머지가 0
				count++;
				//System.out.println(c);
			}
		}
		System.out.println(count);	
		
		// 구구단을 출력하는 법
	    // 2단을 출력하려면
	    // 2씩 더해서(2의 배수로) 출력
	    // 2*1 =2 
	    // 2*2 =4
	    // 2*3 =6
	    // *뒤에는 1씩 증가 = 뒤에는 2씩 증가
	 
		// 총 싸움을 하는데 
		// 체력은 100이 있음
		// 총 한번 맞을 때 마다 17씩 줄어듬
		// 그럼 총 몇번을 맞아야 체력이 0이하가 되는지
		// 100에서 17씩 계속 빼줌
		// 0 이하가 될 때까지
		// 총을 총 5번 쏘고, 남은 체력은 0.8.......이 남음
		int hp =100;
		System.out.println(hp-17);
		hp=hp-17;
		System.out.println(hp-17);
		hp=hp-17;
		System.out.println(hp-17);
		
	
	}
		
}
