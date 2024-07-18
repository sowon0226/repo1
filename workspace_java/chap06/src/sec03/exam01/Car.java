package sec03.exam01;

public class Car {
	// 핃드
	String name;
	String color;
	int cc;
	
	// 생성자 : new 할때 무조건 실행되는 메소드의 일종(CarExam 에서  쓸때는 new Car();를 사용해야함)
	// return은 쓰지 않음 : 무조건 생성된 주소를 돌려주기 때문에 
	// 메소드 명에 해당하는 이름은 무조건 클래스 명이어야함
	
	// 만약에 생성자를 적지 않으면 
	// 기본 생성자가 자동으로 만들어집니다.(기본 생성자는 생략가능)
	// 생성자는 java에게는 중요해서 무조건 있어야함
//	Car(){}
	
	
	// 내가 생성자를 적은 경우
	// 기본 생성자는 만들어지지 않음
	
	// 생성자 사용 이유는
	// 1. 귀찮으니까 무조건 실행하게 만들어줌
	// 2. 생성을 위한 필수값 관리 - 필수값이 없으면 생성을 막음
	// 생성자
	Car(){
		// 다른 생성자 호출
		// 오버로딩 된 다른 생성자 호출
		// 단, 무조건 생성자의 첫 줄에 적어야한다
		this("회색",1000);
		
		
		System.out.println("생성자 실행");
		name = "자동차"; // 필드가 먼저 선언되고 생성자 실행
		System.out.println(name);
		test();
		
//		color ="회색";
//		cc = 1000;
//		this("회색",1000); 다른 생성자를 호출할 때 this씀
	}
	
	Car(String color2, int cc2){
		System.out.println("color : " + color2);
		System.out.println("cc : " + cc2);
		
		color = color2;
		cc = cc2;
	}
	// 메소드
	void test() {
		System.out.println("테스트");
	}
	
	void print() {
		System.out.println("=-=-=-=-=-=-=--=-=--=-");
		System.out.println("color : " + color);
		System.out.println("cc : " + cc);
		System.out.println("=-=-=-=-=-=-=--=-=--=-");
	}
}
