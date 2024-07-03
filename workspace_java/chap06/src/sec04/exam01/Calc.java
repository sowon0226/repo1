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
	
	// 플러스 메소드
	/**
	 * 더하기 
	 * 두 수를 받아서 더한 결과를 돌려줌
	 *  
	 * 메소드명 : plus
	 * 전달인자 : int, int
	 * 리턴타입 : int (두 수를 더한 결과 )
	 * @ 의 의미는 Exam에서 자동완성 해주면서 이쁘게 만들어줌
	 *  @author : 메일주소 , 이름 또는 언제 만듬 
	 *  @param : int x, int y
	 *  @return : int
	 */
	// 전달인자, 지역변수는
	// 선언되고 메소드 또는 }가 끝나면 사라짐
	int plus(int x, int y) {
		System.out.println("x : " + y);// 메소드를 만들고 나서 출력을 먼저 해보는 것이 좋다
		System.out.println("y : " + y);
		
		
		return x + y;
	}
	/*
	 * 두 정수를 받아서
	 * 나누기한 결과를 
	 * 실수 (소수점 있는거)로 돌려줌
	 * 
	 * 두번째 전달인자가 0인 경우에 대한
	 * 방어 코딩
	 * 0이라면 "0으로 나눌수 없습니다" 출력
	 * return 값이 0으로 고정
	 * 
	 * 전달인자 :  int, int
	 * 리턴타입 : double
	 */
	double divide(int a, int b){
		// =을 기준으로 오른쪽이 먼저 실행되므로
		// x / y가 실행되는데 이건 int/int라서 결과사 int
		// 이미 소수점이 없어진 int를 double에다 담는게 의미가
		// double result= x / y;
		// int x 를 double로 바꾸기 위해서 자동으로 double 형변환 됨
		// double result2 = (double)a/ (double)b;
	if(b == 0) {
		System.out.println("0으로 출력할 수 없습니다");
		return 0;
		
		}
	else {
	double result2 = (double)a/ (double)b;
	return result2;} 
	}
	/*
	 * 더하기 2
	 * 
	 * 전달인자 : int 배열
	 * 리턴타입 : int
	 */
	
	int plus2(int[] num) {
		int x = num[0];
		int y = num[1];
		
		return x + y;
		
	}
		/*
		 * 전달인자의 개수를 지정하지 않고
		 * 전달 받은 만큼 처리하는 방법
		 * "...." 가변인자, 가변 길이 파라메터
		 * 전달 받은 모든 전달인자를 배열로 처리
		 */	
	int plus3 (int ...num) {
		System.out.println("num : "+num);
		
		int sum = 0;
		for (int i = 0; i < num.length; i ++) {
			sum = sum + num[i];
		}
		return sum;
	}
}
