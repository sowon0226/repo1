package sec01_실습.exam_01;

public class MegaCoffee extends Cafe {

	MegaCoffee(){
		this.price = 4500;
		this.pay = "현금"; 
		this.name = "할메커피"; 
	}
	void setCoffe(int price, String pay, String name) {
		this.price = price;
		this.pay = pay; // 결제방식
		this.name = name; // 메뉴
	}
}
