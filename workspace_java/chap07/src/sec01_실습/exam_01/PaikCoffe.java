package sec01_실습.exam_01;

public class PaikCoffe extends Cafe {

	PaikCoffe() {
		
		this.price = 5000;
		this.pay = "카드"; // 결제방식
		this.name = "사라다빵"; // 메뉴
	
	}

	void setCoffe(int price, String pay, String name) {
		this.price = price;
		this.pay = pay; // 결제방식
		this.name = name; // 메뉴
	}
}
