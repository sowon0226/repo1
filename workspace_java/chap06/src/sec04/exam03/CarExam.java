package sec04.exam03;

public class CarExam {

	public static void main(String[] args) {
		 // 메소드 안에 지역변수는 지역변수를 먼저 쓰고 버리면 됨
		
		// Car클래스 생성해서
		// Car 타입의 myCar변수에 담는다
		Car myCar = new Car();
		
		// gas가 남았는지 받아온다
		boolean gasState = myCar.isLeftGas();
		
		if(gasState) {
			System.out.println("출발합니다");
			myCar.run();
			}
		System.out.println(myCar.name); // 아무런 메소드를 주지 않아서 null
//		myCar.name = "욕@#$*&"
		myCar.setName("몽식이");
		System.out.println(myCar.name); // nick이라는 변수에 몽식이를 받아서 사용해서 결과값이 몽식이
		
		myCar.setName(""); // 아무것도 안보냈더니 0 // 결과값이 이름은 필수 입니다 인 이유는 if를 통과해서 else로 넘어감
		System.out.println(myCar.name);
		// 결과값이 몽식이가 나온 이유는 출력에서 name 때문에
	}
	
}
