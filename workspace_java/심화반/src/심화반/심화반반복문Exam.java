package 심화반;

import java.util.Scanner;

public class 심화반반복문Exam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 문제 1
//		int n = scanner.nextInt();
//		int sum = 0;
//		for(int i = 0; i < n; ++i) {
//			int t = scanner.nextInt();
//			sum += t;	
//		}
//		System.out.println(sum);
		
		// 문제 2
//		int n1 = scanner.nextInt();
//		int n2 = scanner.nextInt();
//		long ret = n1;
//		for(int i = 0; i <n2-1; i++) {
//			ret *= n1;
//		}
//		System.out.println(ret);
		
		/*
		 * Q3. 정수 값을 하나 입력받으세요. 그리고 아래 형태처럼 행렬을 출력하는 프로그램을 작성하 세요.
			"같은 줄"에서 "글자 사이 공백"은 반드시 한  칸이어야 합니다(맨 앞 또는 맨 뒤의 공백은 상관없음).
			입력 값은 1 이상의 int 정수입니다.
			ex1) 입력 3 -> 출력 :
			00 01 02
			10 11 12
			20 21 22
			ex2) 입력 4 -> 출력 :
			00 01 02 03
			10 11 12 13
			20 21 22 23
			30 31 32 33
			입력 2
			00 01
			10 11
			시작은 00
			오른쪽 방향의 규칙은? 오른쪽 자리가 0부터 하나씩 늘어남
			어디까지 ? 입력받은 숫자만큼
			다시 적으면
			오른쪽 방향의 규칙은 
			입력받은 숫자 만큼 반복해서 
			오른쪽 자리가 0부터 하나씩 늘어남
			단, 왼쪽자리는 계속 유지됨
			아래쪽 방향의 규칙은 
			입력받은 숫자 만큼 반복해서 늘어남
			왼쪽 자리가 0부터 하나씩 늘어남
			단, 오른쪽 자리는 계속 유지됨
			
			어떻게 동시에 출력할까?
			일단 한줄만 해볼까?
			00 01
		 */
		// 문제 3
//		int n = scanner.nextInt();
//		for(int i = 0; i < n; i++) {
//		for(int a = 0; a < n; a++) {
//			System.out.print(i);
////			System.out.print("*");
//			System.out.print(a);
//			System.out.print(" ");
//		}
//		System.out.println();
//		}
		
		// 문제 4
//		int n = scanner.nextInt();
//		for(int a = 0; a < n; a++) {
//			for(int b = 0; b < n; b++) {
//				if(a == n-1 || a == 0) {
//					System.out.print("*");
//				}else if(b == n-1 || b == 0) {
//				System.out.print("*");
//				}else {
//				System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		// 문제 5
//		int n = scanner.nextInt();
//		for(int i = 1; i < n+1; i++) {
//		for(int a = 0; a < n; a++) {
//			System.out.print(n);
//			System.out.print("*");
//			System.out.print(a);
//		   }
//		//System.out.println();
//	    }
//		int n = scanner.nextInt();
//		for(int a = 0; a <= 4; a++) {
//			for(int b = 0; b <=4; b++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		String[] array = new String[] {"오","빠","옥","상","으","로"};
//		String a;
//		for(int i = 0; i <= array.length; i++ ) {
//			for(int j = 0; j < i; j++) {
//			System.out.print(array[j]);
//		   }
//			System.out.println();
//		}
		
	}	
}
