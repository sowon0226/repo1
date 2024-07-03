package sec02.exam01;

public class CarExam {

	public static void main(String[] args) {
		//		   리턴타입 메소드이름 매개변수  변수명
		// public static void main의 main은 자바에서 실행되는 함수를 찾기 때문에 중요함 ? (자동으로 실행됨)
 
		Car myCar = new Car();  
		Car myCar2 = new Car(); // myCar2에 Carjava에 있는 Car(임팔라) 사옴 
		
		System.out.println(myCar.model);
		
		myCar.model = "흑팔라";
		System.out.println(myCar.model);
		
		System.out.println(myCar2.model); // 그래서 결과 값이 임팔라나옴
		
//		int a;
//		System.out.println(a);
		System.out.println(myCar.speed); 
		// Car.java에 있는 int speed가 선언 후 값을 정해주지 않아서 결과값이 0이 나옴 (int=0이임)
		
		
		}

}
