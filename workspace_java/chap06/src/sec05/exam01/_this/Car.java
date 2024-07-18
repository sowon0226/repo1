package sec05.exam01._this;

public class Car {
	
	// 인스턴스 : new가된 클래스를 인스턴스화되었다고 함
	String model;
	int speed;
	Car() {};
	
	// Car(String m){
	//		model = m;
	// }
	Car(String model){
	//	model = model;
		
		int a = 10;
		a = a;
		
		Car c1 = new Car(); 
		c1.model = model;
		
		// 필드에 있는 변수를 쓰기위해서는 this.을 사용해야함
		// this.을 사용하지 않으면 지역변수에 있는 변수를 쓰게됨
		this.model = model; // 필드에 접근하기 위해서 this.을 씀
		
	}
	
	void setSpeed(int speed) {
		this.speed = speed; // 필드에 있는 아이를 데려오기위해서
	}
}
