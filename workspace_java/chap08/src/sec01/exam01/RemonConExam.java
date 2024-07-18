package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

public class RemonConExam {
	
	public static void main(String[] args) {
		
		RemoteControl tv = new Tv();
		Audio audio = new Audio();
		RemoteControl audio2 = (RemoteControl) audio; // 부모타입의 audio로 바뀌면서 audio2에 들어갈 수 있다
		
//		RemoteControl rc = new RemoteControl(); 자체가 불가능 
		// 부모가 new가 될 수 없음 
		tv.turnOn();
		audio.setVolume(12);
		// setVolume은 RemoteControl(부모)에 있고 Audio에서 오버라이드 하면서 if문이 돌면서 필드에 있는 volume이 있어서 사용가능
		
		List list = new ArrayList();
		// 인터페이스     // 클래스
//		List l2 = new List(); 인터페이스라서 안됨
		
		
	}

}
