package sec01.exam01;

public class Parent {
	// 부모클래스에서 private접근 제한을 갖는 필드,메소드는 
	// 상속 대상에서 제외

	
//	Parent(){
//		System.out.println("Parent 기본 생성자");
//	}
	
	Parent(String name){
		System.out.println("Parent 기본 생성자");
	}
	
	String name = "Parent의 name";
	
	String getName() {
		System.out.println("Parent의 getName 실행");
		return this.name;
	}
}
