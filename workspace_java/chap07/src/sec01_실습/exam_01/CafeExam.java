package sec01_실습.exam_01;

public class CafeExam {

	public static void main(String[] args) {
		
		PaikCoffe co1 = new PaikCoffe();
		
		System.out.println("====================");
		co1.setCoffe(5000, "카드", "사라다빵");
		co1.전체출력();
		
		System.out.println("====================");
		co1.setCoffe(7000, "카드", "대파라떼");
		co1.전체출력();
		
		System.out.println("====================");
		co1.setCoffe(4000, "카드", "왕커피");
		co1.전체출력();
		
		System.out.println("====================");
		co1.setCoffe(8000, "카드", "마카롱");
		co1.전체출력();
		
		MegaCoffee co2 = new MegaCoffee();
		
		System.out.println("====================");
		co2.setCoffe(4500, "현금", "할메커피");
		co2.전체출력();
		
		System.out.println("====================");
		co2.setCoffe(3900, "현금", "왕메가아이스티");
		co2.전체출력();
		
		
		System.out.println("====================");
		co2.setCoffe(3300, "현금", "체리콕");
		co2.전체출력();
		
		System.out.println("====================");
		co2.setCoffe(3700, "현금", "허니자몽블랙티");
		co2.전체출력();
		
		System.out.println("====================");
		co2.setCoffe(4400, "현금", "핫치킨");
		co2.전체출력();
		
		System.out.println("====================");
		co2.setCoffe(4500, "현금", "디카페인메가");
		co2.전체출력();
	}

}
