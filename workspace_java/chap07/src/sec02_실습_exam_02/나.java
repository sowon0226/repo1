package sec02_실습_exam_02;

public class 나 {

	void order(커피전문점 c, String menu, int a) {
		if(c.isDT()) {
			c.order(menu);
			c.pay(a);
			System.out.println("드라이브쓰루 이용한다");
		}else {
			c.order(menu);
			c.pay(a);
			System.out.println("드라이브쓰루 이용하지 않는다");
		}
	}
}
