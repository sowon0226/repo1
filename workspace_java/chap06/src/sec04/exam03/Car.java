package sec04.exam03;

import java.util.Scanner;

public class Car {

	// 필드 == 멤버 변수
//	Scanner s = new Scanner(System.in);
//	int gas = s.nextInt();
	int gas = 10; // 변수는 gas
	// 클래스 생성(new하는 순간에)과 함께 생성되고
	// 클래스 소멸 시 까지 생존
	// 메모리를 차지함
	// 계속 저장된다. 
	// 메소드에서 변경하는 경우
	// 다음변 실행까디 저장해둠
	// 그래서 계속 초기화 해야하는 상황이 있을 수 있다
	// 클래스 안의 모든 곳에서 사용 가능하다

	boolean isLeftGas() {
		if (gas == 0) {
			// gas의 값이 0이면 false
			// 그렇지 않으면 true
			System.out.println("gas가 없습니다");
			return false; // 이 순간에는 리턴이 가능함
						  // if 안에 return은 false와 true따라 리턴이 실행됨
		}
			else { System.out.println("gas가 있습니다");
			return true; //  if 밖에서 return은 종료가 됨 
		}
	}
//		System.out.println("gas가 있습니다");
//		return true; //  if 밖에서 return은 종료가 됨 
		boolean isLeftGa2s() {
				boolean result = false;
	
			if (gas == 0) {
				// gas의 값이 0이면 false
				// 그렇지 않으면 true
				System.out.println("gas가 없습니다");
			   result =  false; 
			}
				else { System.out.println("gas가 있습니다");
				 result = true;  // if문 안에 리턴이 두개이면 하나만 실행
			}
			return result;
	}
		
	// 주행 메소드
	// gas가 없을 때까지 달리기
	void run() { // void를 사용하는 경우 return을 써도 되고, 안써도 됨 // void 함수명(함수명은 아무거나 써도 됨)
		while(true) {
			if(gas > 0) {
				System.out.println("주행 중 ...잔량 : "+ gas);
				gas--;
			}else {
				System.out.println("주행 종료 ...잔량 : "+ gas);
				// 리턴차입이 void이므로
				// 아무값도 돌려주면 안된다
				// return을 만나면 그 즉시
				// 메소드 종료
				return; // break 대신 사용함 return이 break보다 더 강함
			}
		}
	}
	
	String name;
	
	// name의 값을 변경
	// name의 길이가 0인 경우 변경하지 않음
	// 전달인자 : String
	// 리턴타입 : 없음
	void setName(String nick) { // 전달인자
		System.out.println(nick.length()); // 글씨 길이가 3(몽식이)
		if(nick.length() !=0) {
			name = nick; // name 필드에 nick값을 넣어줌 
		}else {
			System.out.println("이름은 필수 입니다");
		}
	}
}
