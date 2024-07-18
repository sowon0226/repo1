package sec01_실습.exam_01;

public class Cafe {

	// Cafe 부모
	// 주문 order
	// 지불 pay

	// PaikCoffee
	// 특별히 빽다방에서만 사라다빵 판매

	// MegaCoffee
	// 특병히 메가카피에서만 할메가 판매

	int money = 20000;
	String order; // 주문
	String pay; // 결제방식
	String name; // 메뉴
	int price; // 가격
	
	
	void 전체출력() {
		지불방법();

	}

	void order() {
		System.out.println(this.name +"주문합니다");
	}

	void 지불방법() {
		if (pay.equals("카드")) {
			order();

			System.out.println("카드를 받았습니다");
			pay = "카드";
			카드결제();

		} else {
			order();
			System.out.println("현금을 받았습니다");
			pay = "현금";
			현금결제();
		}
	}

	int 현금결제() {
	
		if (money < this.price) {

			System.out.println(this.name + "주문은 금액 부족으로 취소합니다");
			return 0;
		} else {
			money -= price;
			System.out.println(price + "원 결제하겠습니다");
			System.out.println(money + "원 잔돈 받으세요");
			System.out.println(this.name + "완료했습니다");
			
			return 0;
		}

	}

	void 카드결제() {
		
		if (money < this.price) {

			System.out.println(this.name + "주문은 금액 부족으로 취소합니다");

		} else {
			money -= price;
			System.out.println(price + "원 결제하겠습니다");
			System.out.println("남은 금액은 : "+(money)+ "원 입니다");
			System.out.println(this.name + "주문 완료했습니다 ");

		}

	}

}