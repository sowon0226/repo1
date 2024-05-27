package sec01.exam01;

public class 연산자_퀴즈 {

	public static void main(String[] args) {
		
		/* 문제 1
		 * 7234원이 있습니다
		   5000원, 1000원, 500원, 100원, 50원, 10원, 1원
		   각각 최대 몇개까지로 표현할 수 있나요?
		 */

		/* 방법 1
		 * 5천원 : 1
		 * 1천원 : 2
		 * 500원 : 0
		 * 100원 : 2
		 * 50원 : 0
		 * 10원 : 3
		 * 1원 : 4
		 * 
		 * 1. 예측과 결과가 같은지 확인 - 개발
		 * 2. 숫자를 바꿔도 잘 나오는지 두어번 해보기 - 테스트
		 */
		 // 복잡할 수록  간단하게 생각해보기
		 
		 int money = 7234;
		 /*
		 //5천원  해결
		 int m5000 = 7234 / 5000; //int끼리 나누기라서 결과가 int
		 						  // 예상값 : 1
  		 System.out.println("5천원 : "+ m5000); // 결과 : 1
		 		 
		 //1천원 해결
		 //int m1000 = money / 1000; //예상 값 : 2
		 // 2가 나와야 하는데 7나옴
		 //이유 대상금액이 7234여서
		 //그러면 7235 - 5000을 대상 금액으로 다시해보기
		 //System.out.println("1천원 : "+ m1000); 결과 : 7
		 //int m1000 = (money - 5000) / 1000; //결과 2 // 7천원일 때만 통함
		 //17천원일때는 5천원 3장을 빼고 계산해야 함
		 //int m1000 = (money - (5000 * m5000)) / 1000;
		 //int money2 = money - (5000 * m5000);
  		  money =  money - (5000 * m5000);
		 int m1000 = money / 1000;
		 
  		 
		 System.out.println("1천원 : "+ m1000);
		 
		 //500원 해결
		 //원래 금액에서 5천원을 빼고, 1천원 뺀 나머지 금액에서 나누기
		 //int m500 = (money - (5000 * m5000) - (1000 * m1000)) / 500;
		 money = money - (1000 * m1000);
		 int m500 = money / 500;
		 System.out.println("500원 :"+ m500);
		 */
		 
		 //방법 2
		 int m5000 = money / 5000;
		 System.out.println("5천원 : "+m5000);
		 
		 money = money % 5000;
		 int m1000 = money / 1000;
		 System.out.println("1천원 : "+ m1000);
		 
		 //money = money % 1000;
		 money %= 1000;
		 int m500 = money / 500;
		 System.out.println("500원 :"+ m500);
		 
		 
		 
		 
	}

}
