package sec04.exam01;

public class CalcExam { // public : 똑같은 파일명에만 사용 가능
			// 이 사이에 있는 변수는 필드
	public static void main(String[] args) { //  메소드
											// 메소드는 무조건 return이 있어야 함
		// Calc 와 Calc.Exam은 차이가 없다 
		// 단, Calc.Exam에서 Calc를 사용하려면 new를 사용해야 불러올 수 있다
		// 또한  Calc.Exam에서  Calc.Exam을 사용 할 때에는 new를 사용 할 필요가 없다
		
		powerOn(); // 선언 되어있는  void powerOn() 실행 됨
		powerOn(); // (이건 내 꺼) 두번 쓰면 두번 나옴
		
		Calc calc = new Calc(); // Calc.java(남의 꺼 사온거)에 있는 powerOff를 내 Exam에 데려 올 수 있다
		calc.powerOff(); // 어디에 있는 calc를 말하는지 알려줌 (cacl.java에 있는 것을 뜻함)
		System.out.println(calc); // sec04.exam01.Calc@5ccd43c2 이 덩어리 안에 내가 원하는게 있다 함수든 변수든 다 있다 
		Calc calc2 = new Calc();
		System.out.println(calc2);
		
		Calc calc3 = new Calc();
		calc3.powerOn(); 
//		calc3.isOn = true;
		
		calc2.powerOff();
		
		// 결과를 담아서 재사용 한다
		int result = calc3.plus(3, 8); // plus에 마우스를 올려주면 메소드 명을 알 수 있다
		System.out.println("plus 결과 : " + result);
//		int result = calc3.plus(3,calc3.plus(3, 8) ); 나중에는 메소드 안에 메소드가 있는 것을 사용하게 됨 ?
		
		double result2 = calc3.divide(5, 0);
		System.out.println("divide 결과 :" + result2);
		
		// 배열 쓰는 방법 3가지
//		int[] a = {2,7};
//		int[] a = new int[] {2,7};
		int[] a = new int[2]; // 두개를 담은 덩어리 하나만 줄 수 있다는 장점
		a[0] = 2;
		a[1] = 7;
		System.out.println( calc3.plus2(a));
		
//		System.out.printf(:"%d, %s,3 "abc"); 매개 변수의 개수를 모를 때 System.out.printf를 사용해서 출력
		
		int num = calc.plus3(1,2,3,4);
		System.out.println("plus3 결과 " + num);
		
		num = calc.plus3(1,2,3,4,5,6,7,8);
		System.out.println("plus3 결과 " + num);
		
		
	}
	// static 안에서는 static만 쓸 수 있다.
	static void powerOn() { // 내 꺼 
		System.out.println("전원을 켭니다");
	
	}
	
}
