package sec01.exam04._super.food;

public class Food {
	
	Food(){
		System.out.println("Food 생성자 실행");
	}
	String name;
	int price;
	String recipe;
	String type;
	
	/*
	 * 이름 nameS
	 * 가격 price
	 * 주재료 recipe
	 * 종류 type
	 */
	
	
	/*
	 * 먹는다 eat()
	 * 주문한다 order()
	 * 요리한다 cook()
	 */
//	void eat() {
//		System.out.println("제육을 먹는다");
//	}
//	void order() {
//		System.out.println("제육을 주문한다");
//	}
//	void cook() {
//		System.out.println("양념고기를 볶는다");
//	}
	/**
	 * 주문기능
	 * @param int money
	 */
	int eat() {
		System.out.println(this.name + " 먹는다");
		return (int)(Math.random()*5)+1; // 별점
	}
	int order(int money) {
		int change = 0;
		if(money < this.price) {
			System.out.println(this.name + "주문은 금액 부족으로 취소합니다");
		}else {
			System.out.println(this.name + "주문한다");
			change = money - this.price;
		}
		return change;
	}
	/**
	 * @param int master 요리 숙련도
	 * @return String 조리결과
	 */
	String cook(int master) {
		if(master > 7) {
			return "기가막히게 잘됨";
		}else if(master > 4 ){
			return "먹을만하게 됨";
		}else {
			return "나혼자 먹자";
		}
		
	}
}
