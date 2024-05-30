package sac01.exam01;

import java.util.Scanner;

public class BankExam {

	public static void main(String[] args) {
		
		// 은행 계좌의 잔고 관리 시스템
		// 1. 입금, 2. 출금, 3. 조회, 4.종료
		// 입금 : 잔액에서 더하기
		//			* 0, 음수는 실행되지 않게 - 금액을 확인하세요
		// 출금 : 잔액에서 빼기
		//			* 잔액보다 큰 금액은 실행되지 않게 - 잔고가 부족합니다
		// 조회 : 잔고 출력
		// 종료 : 반복 종료
		
		boolean run = true;
		int balance = 0;// 잔액
		Scanner scan = new Scanner (System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1. 입금 |2. 출금 |3. 잔고 |4. 종료");
			System.out.println("------------------------------");
	    int menu = scan.nextInt();
	    
	    if( menu == 1);
	        System.out.println("입금");
			balance+=scan.nextInt();
			System.out.println("예금액" +balance );

	    if( menu == 2);
	        System.out.println("출금");
			balance-=scan.nextInt();
			System.out.println("출금액" +balance );
		int b = scan.nextInt();
		
	    if( menu == 3);
	        System.out.println("잔고");
	        System.out.println("------------------------------");
			System.out.println("1. 입금 |2. 출금 |3. 잔고 |4. 종료");
			System.out.println("------------------------------");
			System.out.println("잔액");
			
			System.out.println("잔액" +balance);	
		int c = scan.nextInt();
		
		 if( menu == 4);
	        System.out.println("종료");
	        System.out.println("------------------------------");
			System.out.println("1. 입금 |2. 출금 |3. 잔고 |4. 종료");
			System.out.println("------------------------------");
			System.out.println("종료");
			balance =scan.nextInt();
			System.out.println("종료 합니다");	
		int d = scan.nextInt();
		}
		
		

	}

}
