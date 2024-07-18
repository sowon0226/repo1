package sec01_실습.exam_01;

public class Car {
	/*
	 * 다음의 클래스를 상속밭은 클래스 2개이상 만드시오. 단, drive() 메소드는 필수
	 */

	// 자동차 Car
	// void drive(){
	// syso("운전을 시작합니다")}

	String name; // 자동차 이름
	String type; // 경유인지 휘발유인지
	String color; // 자동차 색
	String model; // 자동차 종류
	int engin; // 자동차 배기량
	int speed;

	void speed출력() {
		System.out.println("시동을 걸었습니다");
		System.out.println(speed + "km");
	}

	void setSpeedUp(int a) {
		speed += a;
//		drive();
		System.out.println(speed + "km의 속도로 주행중 입니다");
	}

	void stop() {
		speed = 0;
		System.out.println("정지합니다");
	}

	void setSpeedDown(int a) {
		if (speed <= a) {
			stop();
		} else {
			speed -= a;
//			drive();
			System.out.println(speed + "km의 속도로 주행중 입니다");
		}
	}
//	void engin출력() {
//		System.out.println(engin + "cc");
//	}

	void 전체출력() {
		name(name);
		color(color);
		model(model);
	}
//	void type() {
//		type();
//	}

	void drive() {
		System.out.println("이제 출발합니다");
	}

	void name(String 차이름) {
		System.out.print("이름은 :" + name + "이고, ");
	}

	void color(String 색) {
		System.out.println(this.color + "색 입니다");
	}

	String type(String 주유) {
		if (this.type.equals(주유)&& speed == 0) {
			System.out.println("주유를 시작합니다");
		} else {
			System.out.println("다시 확인해주세요");
		}
		return this.type;
	}

	void model(String 차종) {
		System.out.println(this.model + "이고," + this.engin + "cc" + "입니다");
	}

}