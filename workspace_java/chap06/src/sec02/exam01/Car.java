package sec02.exam01;

public class Car {
	// 두개 이상의 클래스 선언도 가능함
	// 단, 한 파일 안에서 두개이상으로 나눠질 수 있다

	String model = "임팔라";
	// model 변수 선언과 동시에 초기화
	
	// 초기화를 하지 않은 경우
	// 0, false, null로 자동으로 초기화 됨
	int speed; // 선언 후 값을 정해주지 않아서 결과값이 0이 나옴 (int=0이임)
	// 변수 선언만 한 것
	
	// speed 변수의 값을 60으로 바꾸는 행동 (바꾸는걸 실행)
	// 필드 영역에서는 실행(행동)하면 에러
    // speed = 60; 안됨
	
	// void : 줄 것도 받을 것도 없다 (아무것도 안주겠다는 리턴타입)
	
	// double divide(int x, int y){...}
	// 리턴타입  메소드이름  매개변수(전달인자, 변수)
}