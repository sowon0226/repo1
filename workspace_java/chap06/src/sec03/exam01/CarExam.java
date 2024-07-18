package sec03.exam01;

public class CarExam {
	// CarExam() {
	//
	//}

	public static void main(String[] args) {
		
		Car myCar = new Car("검정",2500); 
		myCar.print();
		// () 이것이 출력을 실행하라 라는 말임
		
		Car myCar2 = new Car();
		myCar2.print();
	}

}
