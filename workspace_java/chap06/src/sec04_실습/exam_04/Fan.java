package sec04_실습.exam_04;

public class Fan {
	// 문제 1
	/*
	 * 선풍기 Fan
	 * 
	 * 전원 상태를 저잘할 필요가 있다
	 * 전원 켜기 기능
	 * 전원 끄기기능
	 * 각각  전원 상태 값을 변경
	 * 약풍 기능 
	 * 강풍 기능 
	 * 전원이 켜진 상태에서만 바람 나옴
	 * FanExam에서 Fan의 약풍 실행
	 */

	boolean isOn = false;
	
	void powerOn() {
		System.out.println("전원을 켭니다");
		isOn = true;
	}
	void powerOff() {
		System.out.println("전원을 끕니다");
		isOn = false;
	}
	
	void power1() {
//		System.out.println("약풍입니다");
		if(isOn == true) {
			System.out.println("약풍입니다");
		}else if(isOn == false) {
			System.out.println("전원을 켜주세요");
		}
	}
	void power2() {
//		System.out.println("약풍입니다");
		if(isOn == true) {
			System.out.println("강풍입니다");
		}else if(isOn == false) {
			System.out.println("전원을 켜주세요");
		}
	}
}
