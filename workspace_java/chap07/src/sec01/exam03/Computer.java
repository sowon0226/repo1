package sec01.exam03;

public class Computer extends Calc {
	// new하기 전에는 그냥 글씨인데 new를 하는 순간 .class가 되면서 컴파인이 됨
	// @Ovrride(어노테이션이라고부름): 위에 있는 부모의 내용과 똑같은지 확인해주는 효과
	//   						부모에 없는 내용을 내꺼에 썼는지 찾아주는 것이기 때문에 사용하면 좋음 (족보같은것)
	
	// super.부모클래스(); : 자식 클래스에서 부모 클래스를 호출할 때 사용
	
	double areaCircle(double radius) {
		System.out.println("Computer의 areaCircle 실행");
		plus(1,2);
		return Math.PI * radius * radius;
	}
	
	int plus(int x, int y) {
		System.out.println("문의하신 정답은");
		int result = super.plus(x, y);
		System.out.println(result + "입니다");
		
		return result;
	}
	
}
