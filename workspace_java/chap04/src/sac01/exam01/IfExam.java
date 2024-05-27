package sac01.exam01;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		//if문 연습
		int score = 90;
		
		// if (score > 90)
		if (score >= 90) {
			System.out.println("90점 이상입니다");
			// 조건문이 참인경우에만 동작함
			
			if (score >= 95) {
				System.out.println("95점 이상입니다");
			}
		}
		if (score < 90) {
			System.out.println("90점 미만입니다");	
			// 조건문이 거짓인 경우에는 동작하지 않음
		}
		
		//참고로
	 	boolean up90 = score >= 90;
	 	if (up90) {
		   System.out.println("up90");
	 	}
	 	if ( !up90) {
	 		System.out.println("!up90");
	 	}
	 	if (up90 ) {
	 		System.out.println(" 참");
	 	}else {
	 		System.out.println("거짓");
	 	}
	 	
	 	if (score >= 90) {
	 		System.out.println("90점 이상입니다");
	 		System.out.println("학점은 A입니다 ");
	 	}
	 	if (score <90 && score >= 80 ) {
	 		System.out.println("80점 이상입니다");
	 		System.out.println("학점은 B입니다 ");
	 	}
	 	if (score >= 90) {
	 		System.out.println("학점은 A입니다 ");
	 	}else if (score <90 && score >= 80 ) {
	 		System.out.println("학점은 B입니다 ");
	 	}else {
	 		System.out.println("학점은 C입니다 ");
	 	}
	 	//if .else if , else 이런식으로 묶여있으면 
	 	//그 중 하나만 실행 된다
	 	if (score >= 90) {
	 		System.out.println("학점은 A입니다 ");
	 	}else if (score>=80) {
	 		//이거 위에 조건이 거짓일 때만 여기로 온다
	 		System.out.println("학점은 B입니다 ");
	 	}else {
	 		System.out.println("학점은 C입니다 ");
	 	}
	 	
	 	
	 	//3은 짝수인가?	 	
	 	int num = 3;
	 	Scanner input = new Scanner(System.in);//Scanner 배우기
	 	num = input. nextInt();		
	 	if (num % 2 == 1) {
	 		System.out.println("홀수");
	 	}else {
	 		System.out.println("짝수");
	 	}
    


	} 	
}
