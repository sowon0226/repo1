package sec04.exam01;

public class Calc {
	
	// 계산기 전원 상태
	boolean isOn = false; // isOn변수  <<< 필드 : 선언과 동시에 초기화는 가능

	void powerOff() { // 남의 꺼 메소드  메소드 : 결과값을 외부(호출한 것)로 리턴(돌려줄)수 있다
		System.out.println("전원을 끕니다"); 

	}
	
	void powerOn() { // 남의 꺼 메소드  메소드 : 결과값을 외부(호출한 것)로 리턴(돌려줄)수 있다
		System.out.println("전원을 켭니다"); 
		isOn = true; // 지금 켜진 상태라고 알려주는 버튼?
	
	}
}
