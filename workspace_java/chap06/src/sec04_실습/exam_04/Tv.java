package sec04_실습.exam_04;

public class Tv {

	 /* 
	 * 문제2
	 * TV 만들기
	 * 전원
	 * 볼륨 - up/down (0~10)
	 *  * >>> 볼륨의 범위를 벗어나지 못하게 해주세요
	 * 채널 up/ down / 직접 입력
	 * 정보보기 : 현재 전원 상태 , 볼륨, 채널정보 출력
	 */ 
	boolean isOn = false;
	int y;
	int x;
	void TvOn() {
		System.out.println("전원을 켭니다");
		isOn = true;
	}
	void TvOff() {
		System.out.println("전원을 끕니다");
		isOn = false;
	}
	void vol(String a) {
		if(a == "up") {
			if(y < 10) {
				y++;
				System.out.println("볼륨을 높입니다" + y);
			}else if (y == 10) {
				System.out.println("최대입니다");
			}
		    }else if(a == "down") {
			if(y < 10) {
				System.out.println("볼륨을 낮춥니다" + y);
				y--;
			}else if(y == 0) {
				System.out.println("음소거");
			}
		}
	} 
	void ch(String c, int e) {
		if(e ==0) {
			if(c == "up") {
				x++;
				System.out.println("채널 올림" +x);
			}else if (c == "down") {		
				x--;
				System.out.println("채널 내림" + x);
			}
		}else if (e > 0) {
			x = e;
			System.out.println("현재 채널은 : "+ e);
		}
	}	
	void j() {
		System.out.println("현재 전원 상태 : "+ isOn);
		System.out.println("현재 볼륨 상태 : "+ y);
		System.out.println("현재 채널 상태 : "+ x);
	}
}
