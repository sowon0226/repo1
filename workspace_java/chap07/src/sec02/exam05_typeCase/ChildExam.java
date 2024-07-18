package sec02.exam05_typeCase;

public class ChildExam {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.method1("차일드");
		System.out.println("결과 : 차일드의 field1 : "+ child.field1 );

		Parent p = new Child();
		p.method1("자식이 오버라이드한 곳에 보내는 전달인자");
		System.out.println("결과 : p의 field1 : "+p.field1);
		// p.field1은 부모 클래스의 필드를 가르킨다
		// Override는 메소드만 된다
		
		Child child2 = (Child)p;
		System.out.println("결과 : child2의 field1 : "+child2.field1);
		
		Parent p1 = new Child();
		Parent p2 = new Child101();
		
		//p1 = p2
		Child c = (Child)p1;
		
		// p2가 Child에서 왔는가?
		// p2는 Child의 이스턴스인가?
		boolean isChild =p2 instanceof Child;
		System.out.println(isChild);
		if(isChild) {
		Child c2 = (Child)p2;
		}
		if(p2 instanceof Child101) {
			Child101 c3 = (Child101)p2;
		}
		System.out.println(123);
	}

}
