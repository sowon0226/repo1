package sec01.exam04._super.food;

public class 제육 extends Food {
	
	

	제육(){
		//super();가 생략되어있음
		System.out.println("제육 생성자 실행");
		
		this.name = "제육";
		this.price = 8000;
		this.recipe = "돼지고기 앞다리";
		this.type =  "한식";
	}
	
	void setSpicy(String spicy) {
		this.name = this.name += " - "+spicy;
	}
	
	@Override
	// public으로 바꿀 수 있다 , 어디서든 사용이 가능하다
	// private로는 바꿀 수 없다
	int eat(){  
		System.out.println("갓지은 밥을 상추와 마늘에 싸서");
//		System.out.println(this.name + "먹는다");
//		return (int)(Math.random()*5)+1;
		return super.eat();
	}
}
