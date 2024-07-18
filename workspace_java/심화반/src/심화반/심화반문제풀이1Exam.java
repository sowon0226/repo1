package 심화반;

import java.util.Scanner;

public class 심화반문제풀이1Exam {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		int a1 = a.nextInt();
		int a2 = a.nextInt();
		// 문제 1
//		System.out.println(a1 % 2);
//		if(a1 % 2 == 0) {// == 꼭 쓰기, %2 가 0이라는 것은 짝수를 뜻함
//			System.out.println("EVEN");
//		}else{
//			System.out.println( "ODD");
//		}

		// 문제 2 온도 문제랑 비슷함
//		if( a1 > 0) {
//			System.out.println("Positive");
//		}else if ( a1 < 0) {
//			System.out.println("Negative");
//		}else if(a1 == 0) {
//			System.out.println("Zero");
//		}

		// 문제 3
		// switch문에서 switch는 if느낌
		// case는 else if느낌
		// default는 else 느낌
		// 시스템 출력 후 꼭!!!! break 써주기
//		switch(a1) {
//		case 1 :
//			System.out.println("one");
//			break;
//		case 2 :
//			System.out.println("two");
//			break;
//		case 3 :
//			System.out.println("three");
//			break;
//	   default :
//		   System.out.println("other");
//			break;
//		}

		// 문제 4
//		for (int b = 1; b <= 10; b++) {
//			int sum =0;
//			sum = sum + b;
//			System.out.println(sum);
//		}
//		int i = 10;
//		while( i > 0 ) {
//			System.out.println(i);
//			i--; //종료 조건을 주는 것이 졸음 
//		}
//		int a = 10;
//		int b = 10;
//		System.out.println(a+" "+(b+35));
//		if(a1 > 23 || a1 < 0 || a2 >59 || a2 < 0 ) {
//			System.out.println(0+" "+0);
//		} 
		// 문제 5
		if (a2 >= 0 && a2 < 60 && a1 >= 0 && a1 < 24) {
			a2 += 35;
			if (a2 >= 60) {
				a1 += 1;
				a2 -= 60;
			}
			if (a1 >= 24) {
				a1 = 0;
			}
		} else {
			System.out.println("0 0");
		}
	}

}
