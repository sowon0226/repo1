package sec05.exam05._final;

public class Person {
	
//  final 이 붚은 변수는 변경할 수 없다
	final String nation = "korea"; 
	
//  final로 선언하는 동시에 초기화 하지 않은 경우
	// 생성자에서 딱 한번 초기화 할 수 있다
	final String snn;
	
	Person(){
		snn = "1234";
	}
	
	void test() {
//		nation = "USA";
		System.out.println(Math.PI);
	}

}
