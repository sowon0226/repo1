package quiz;

public class Student {

	// 값
	// 이름, 나이, 주소, 성별, 전공, 안경사용여부
	public String name;
	public int age;
	String addr;
	int gender;
	String major;
	boolean hasGlasses;
	
	int intel = 0; // 지식
	int stress = 0; // 스트레스 수치
	int hp = 100; // 체력
	int hungry = 0; // 공복감
	
	
	// 행동 
	
	// 공부
	// 공부한 내용을 출력하고
	// 지식이 높아지고
	// 스트레스 높아지고
	// 체력 낮아지고
	// 공복감 높아지고
	
	// 전달이자 : String 공부한 내용(과목)
	// 리턴타입 : 없음으로 시작해서 바뀜
	public int study(String subject) {
		System.out.println(subject + "을 (를) 공부했다");
		
		
		intel += 5;
		stress += 10;
		hp--;
		hungry++;
		
		// intel을  리턴하는 코드를 완성하세요
		// void는 리턴이 없기 떄문에 
		// 필드에 있는 변수의 타입을 바꿔주고 리턴 변수;로 쓰면 됨
		// void >>> int로 변환
		return intel;
	}
	
	
	// 식사
	// 먹은 음식 출력하고
	// 체력 조금 올라가고
	// 스트레스 조금 낮아지고
	// 공복감 많이 낮아지고
	// 전달인자 : String음식
	// 리턴타입 : int공복감 
	
	int eat(String egg) {
		System.out.println(egg + "계란을 먹었다");
		stress--;
		hp++;
		hungry -= 5;
		return hungry;
	}
	
	// 수면 메소드 완성 (리턴값 없음)
	// 전달인자 : 없음
	// 리턴타입 : 없음
	void sleep(String sl) {
		System.out.println("잠을 잔다");
		intel += 5;
		stress -= 50;
		hp += 50;
	}
	int game(String g) {
		study(g);
		
		hungry += 90;
//		stress += 500; // 위 조건에 따라 수치 변동
		hp += 80;
		return stress;
	}
	// 게임 메소드 완성
	// 단, 게임을 하면서 게임 공부도 했다고 치고
	// study 메소드 활용
	// 전달인자 : 게임이름
	// 리턴타입 : 없음 또는 스트레스 수치
	// 시간을 받아서 처리
	
	int game(String g, int hour) {
		System.out.println(g+"시작" + hour + "시간만 하자");
		
		if (hour <= 0) {
			System.out.println("다시 입력해주세요");
		}else if(hour > 0) {
			for (double i =  0; i < hour; i+=0.5) {
			System.out.println("한번만 더하자");
			}
			if(hour <= 2) { // if(hour > 0 && hour <=2) 이렇게 쓴다는 것은
							// hour > 0 && 강조함 
				stress+=200000;
				System.out.println("오늘 좀 안됐다 그만하자");
			}else if(hour <= 4) {
				stress+=50000000;
				System.out.println("간단하게 한 게임 했다");
			}else if (hour > 4) {
				stress+=70000000;
				System.out.println("오늘 신났다");
			}
		}
		
		// 방어코딩
		// hour가 0이하인 경우 다시 입력해주세요
		
		// 시간이 정상인 경우
		// 반목문 연습
		// 난이도1 : 시간당 한번씩 "한번만 더하자"출력
		// 난이도2 : 30분에 한번씩 출력 (단, syso을 두번쓰지 말고)
		// 			증감식에서 0.5씩 더하기로 풀어보자
		
		// 조건문 연습
		// 2시간 이하 - 오늘 좀 안됐다 그만하자 , 스트레스 +5
		// 4시간 이하 - 간단하게 한 게임 했다 , 스트레스 -10
		// 4시간 초과 - 오늘 신났다 , 스트레스 -20
		study(g);
		
		hungry += 90;
//		stress += 500; // 위 조건에 따라 수치 변동
		hp += 80;
		return stress;
		
	}
	
	// 공부할 때랑 게임할 때 받는 스트레스가 다르니까
	// 스트레스를  전달할 수 있는 study를 오버로딩한 메소드 만들기
	int study(String subject, int x) {
		System.out.println(subject + "을 (를) 공부했다");
		
		
		intel += 5;
		stress += x;
		hp--;
		hungry++;
		
		// intel을  리턴하는 코드를 완성하세요
		// void는 리턴이 없기 떄문에 
		// 필드에 있는 변수의 타입을 바꿔주고 리턴 변수;로 쓰면 됨
		// void >>> int로 변환
		return intel;
	}
	
	/* 생성자 문제*/
	// 이름과 나이를 입력받지 않으면 생성하지 못하게 만들기
	// 나이는 중요하지 않아서 이름만 있어도 생성할 수 있게 만들기
	// 단, 두번째 생성자에서는 이름과 전달받는 생성자 호출하기
//	Student(String name, int age){
//		this.name = name; // this.은 변수명이 같을 때만 사용가능
//		this.age = age;
//	}
//	Student(String name){
//		this(name,0);
//		
//	}
	
	// 학원 클래스 만들기
	// 필드
	// 학원생Student 배열[10] 또는 ArrayList
	// 학원이름 : "천안" 또는 "수원"
	
	// 생성자 
	// 학원이름 필수 
	
	// 메소드
	// join(학원생) : 필드에 등록
	// viewList() : 들록된 학원생들의 이름과 나이 출력
	
	
	
	
	
	
	// 내 정보 보기
	@Override
	public String toString() { // 여기서 String은 리턴
		return "Student [name=" + name + ", age=" + age + ", addr=" + addr + ", gender=" + gender + ", major=" + major
				+ ", hasGlasses=" + hasGlasses + ", intel=" + intel + ", stress=" + stress + ", hp=" + hp + ", hungry="
				+ hungry + "]";
	}
	
	
	
}
