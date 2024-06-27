package sac01.exam01;

import java.util.Scanner;

public class for연습Exam {

	public static void main(String[] args) {
		
		// 주어진 수가 양수(0포함), 음수 여부 출력 if문제
//		Scanner scan = new Scanner (System.in);
//		int a = 0;	
//		System.out.println("숫자를 입력하세요");		
//		int a = scan.nextInt();
//		if(a >= 0){
//			System.out.println(a +" : 양수");
//		}else {
//			System.out.println(a +" : 양수");
//		}
		
		// 입력을 3번 반복
		/*for(int i = 1; i <= 3; i++) {
		System.out.println("숫자를 입력하세요");		
		int a = scan.nextInt();
		if(a >= 0){
			System.out.println(a +" : 양수");
		}else {
			System.out.println(a +" : 양수");
		 }

	 */ 
		
		
		//입력받은 숫자가 0이 아닌 동안 계속 반복
//		for( int a = 1; a !=0; ) {
//			System.out.println("숫자를 입력하세요 (종료 : 0)");		
//			 a = scan.nextInt();
//			if(a >= 0){
//				System.out.println(a +" : 양수");
//			}else {
//				System.out.println(a +" : 음수");
//            }
//        }
//		System.out.println("종료되었습니다");
		
		/*
* 0단계
+
+
+
+
+

1단계
+++++

2단계
+++++
+++++
+++++

2-1단계
+ + + + +


3단계
+
++
+++
++++
+++++

4단계
+....
++...
+++..
++++.
+++++

5단계
....+
...++
..+++
.++++
+++++

6단계
....+
...+++
..+++++
.+++++++
+++++++++

7단계
....+....
...+++...
..+++++..
.+++++++.
+++++++++
		 */
		
/*
 * 1단계
 *구구단 한단을 옆으로 출력
 *2x1=2 2x2=4...
 *3x1=3 3x2=6...
 *...
 *2단계
 *구구단 옆으로 3단씩 출력
 *2x1=2 3x1=3 4x1=4
 *...
 *5x1=5...
 *... 		
 */
/*
 * 주사위 두개 굴림
 * 1단계
 * 주사위 2개로 굴려서 나올 수 있는 모든 조합을 출력
 * 
 * 2단계
 *합 별로 나올 수 있는 조합
 * 합이 2 :[1,1]	
 * 합이 3 :[1,2] [2,1]
 */
		
		// 0 단계
		// 3 단계
//		System.out.println("+");
//		System.out.println("++");
	    
		//첫번째 줄
		// +출력
		// 한번 출력 1번 출력
		System.out.print("+");
		System.out.println();
		
		//2번줄
		//+ 출력
		//2번출력
		System.out.print("+");
		System.out.print("+");
		System.out.println();

	    for(int i = 1; i <= 2; i++) {
	    	System.out.print("+");
	    }
	    System.out.println();
	    int j =  2;
	    
	    j++;
	    for(int i = 1; i <= j; j++) {
	    	System.out.print("+");
	    }
	    System.out.println();
	    
	    for(int k= 1; k <= 5; k++) {
	    	for(int i = 1; i<=k; i++) {
	    		System.out.print("+");
	    	}
	    	System.out.println();
	    }
	    
	 }
}
