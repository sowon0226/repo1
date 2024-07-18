package sec06.exam02.pack2;

public class Receipt_1 {

	void test1() {
		Receipt_3 r3 = new Receipt_3();//public이여서 사용이 가능함
		r3.test();// 같은 패키지 안에서 public이여서 사용이 가능함
//		r3.donation(); 내 패키지에서 못쓰면 다른 패키지에서도 못씀
	}
}
