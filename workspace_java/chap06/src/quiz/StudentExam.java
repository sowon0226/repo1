package quiz;

public class StudentExam {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		// 원본을 복사해서 사용
		// 예 ) 이력서 원본을 복사해서 자필로 필기
		
		// 필드는 초기화 없는 경우 0, null, false로
		// new하는 순간 자동 초기화 됨
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.hasGlasses);
		
		//s1.name 과 내 지역병수 name은 아무 관계없음
		String name;
		
		// 지역 변수는 초기화 없이 사용 불가능
//		int a;
//		System.out.println(a);
		
		
//		s1.name = "최민수";
//		s1.age = 20;
		s1.hasGlasses = true;
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.hasGlasses);
		
		Student s2 = new Student();
		System.out.println(s2.name);
		
//		s2.name = "박춘보";
//		s2.age = 50;
		System.out.println(s2.name);
		System.out.println(s2.age);
		
		System.out.println(s1.name);
		
		System.out.println(s1);
		s1.study("java클래스");
		int intel = s1.study("java클래스");
		System.out.println("공부했더니 지식 : " + intel);
		System.out.println(s1);
		
		System.out.println(s1);
		s1.eat("계란을 먹었다");
		int hungry = s1.eat("계란을 먹었다");
		System.out.println("계란을 먹었더니 : " + hungry);
		System.out.println(s1);

		s1.sleep("잠을 잔다");
		System.out.println(s1);
		
		
		System.out.println(s1);
		int stress = s1.game("게임",3);
		System.out.println(s1);
		
		s1.study("포켓몬", 198022);
		System.out.println(s1);
		
		Student s3 = new Student();
		System.out.println("s3.name : "+ "김아영"+ s3.age);
		
		System.out.println(s1);
		System.out.println(s1.toString());
		
		view(s1);
	}

	  static void view(Student s) {
//		String str = s.toString();
		int stress = s.game("오버워치");
		System.out.println("이 학생의 스트레스 수치는 : "+ stress);
	}
}
