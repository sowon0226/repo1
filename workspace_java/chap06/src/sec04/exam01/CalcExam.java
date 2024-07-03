package sec04.exam01;

public class CalcExam { // public : 똑같은 파일명에만 사용 가능
			// 이 사이에 있는 변수는 필드
	public static void main(String[] args) { //  메소드
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
	}
	// static 안에서는 static만 쓸 수 있다.
	static void powerOn() { // 내 꺼 
		System.out.println("전원을 켭니다");
		
	}
}
