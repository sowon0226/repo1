package 심화반;

import java.util.Scanner;

public class 심화반랜덤Exam {

	public static void main(String[] args) {
		// double에 담을 수 있음
		double rand = Math.random();
		// double 답1 = rand * 100; 
		// double * int는 int 가 자동형변환이 이루어짐 그래서
		// int가 double로 바뀜
		// 0 <= rand <1.0
		// (int) 답1;
		System.out.println( (int)-3.5 );
		
		// 5 ~ 7까지 랜덤으로 뽑고 샆을 때
		// 5 + ( 0 ~ 2)
		// int a02 = (int)(rand * 3);// 곱하기 한 결과에 int를 넣어주기 위해 ()를 씀
		// a02 + 5;
		int 결과 = (int)(Math.random() * 3) + 5; // 라고도 쓸 수 있다
		
		int b02 = (int)(Math.random() * 6849684) % 3;  // 0 ~ 9999
		System.out.println(b02 + 5); // 5, 6, 7이 됨
		System.out.println("---------");
		int b01 = (int)(rand * 45) + 1;
		System.out.println(b01);
		rand = (int)(Math.random() * 45) + 1;
		System.out.println((int)rand);
		rand = (int)(Math.random() * 45) + 1;
		System.out.println((int)rand);
		rand = (int)(Math.random() * 45) + 1;
		System.out.println((int)rand);
		rand = (int)(Math.random() * 45) + 1;
		System.out.println((int)rand);
		rand = (int)(Math.random() * 45) + 1;
		System.out.println((int)rand);
		
		// 내 주머니에 만원 있습니다
		// 술을 마시고 싶어요
		// 소주는 : 5000원 
		// 과자 : 2000원 
		// 컵라면 : 1500원
		// 족발 : 35000원
		
		// 문제 int로 -7이 있으면 영상인지 영하인지
		// 그게 30일 때는 영상인지 영하인지
		
		int a = -7;
		if (a < 0){
			System.out.println(a +"영하 입니다");
		}else if (a >= 0) {
			System.out.println(a +"영상 입니다");
		}
		int b = 30;
		if (b < 0){
			System.out.println(b + "영하 입니다");
		}else if (b >= 0) {
			System.out.println(b + "영상 입니다");
		}
		
		// 2000 과 3000 사이의 값을 구하기 
		int c = 1500;
		if (c > 2000 && c <3000 ) {
			System.out.println(c + "는 사이에 있습니다");
		}else {
			System.out.println(c + "는 사이에 없습니다");
		}
		int d = 2500;
		if (d > 2000 && d < 3000) {
			System.out.println(d + "는 사이에 있습니다");
		}else {
			System.out.println(d + "는 사이에 없습니다");
		}
		// 월이 입력되면 계절이 나오게
		// 12 ~ 2월까지는 겨울, 3 ~ 5월까지는 봄 6 ~ 8월까지는 여름, 9 ~ 11월은 가을입니다
		// int c1 = 4;
		 
//		 if (c1 >= 3 && c1 <= 5){
//			 System.out.println(c1+ "는 봄입니다");
//		 } 	
		Scanner c2 = new Scanner(System.in);
		 int c1 = c2.nextInt();	
		 if (c1 ==3 || c1==4 || c1==5) {
			 System.out.println("3,4,5월은 봄입니다");
		 }else if(c1 ==6 || c1==7 || c1==8) {
			 System.out.println("6,7,8여름입니다");
		 }else if(c1 ==9 || c1==10 || c1==11) {
			 System.out.println("9,10,11가을입니다");
		 }else if (c1 ==12 || c1==1 || c1==2) {
			 System.out.println("12,1,2겨울입니다");
		 }else {
			 System.out.println("봄 여름 가을 겨울 끝");
		 }
		 
		 // 변수는 값을 저장과 재활용 위해서
		 // 위에 계절을 출력하면 28, -5 결과가 같이나옴
		 int a1 = 28;
		 if (a1 > 0) {
			 System.out.println(a1 + "도는 영상입니다");
		 }else if (a1 < 0){
			 System.out.println(a1 + "도는 영하입나다");
		 }
		 // 스캐너에 -5를 쓰지도 않았는데 그냥 나옴
		 int a2 = -5;
		 if (a2 > 0) {
			 System.out.println(a2 + "도는 영상입니다");
		 }else if (a2 < 0) {
			 System.out.println(a2 + "도는 영하입니다");
		 }
		 
	}
}



