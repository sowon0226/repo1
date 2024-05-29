package sac01.exam01;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		
//		int i = 1;
//		while( i <= 10 ){
//			System.out.println(i);
//			i++;
//		}
//		
		Scanner scan = new Scanner (System.in);
//		System.out.println(" 메뉴를 고르세요 ");
//		System.out.println("1 : 커피, 2 : 차, 3 : 음료, 0 : 종류 ");
//		int menu = scan.nextInt();
//		if( menu == 1 ) {
//			System.out.println("커피를 드리겠습니다");
//		}else if ( menu == 2 ) {
//			System.out.println("홍차 그리겠습니다");
//		}else if ( menu == 3 ) {
//			System.out.println("음료 드리겠습니다");
//		}else if ( menu == 0 ) {
//			System.out.println("다음에 또 오세요");
//		}			
//		
//		Scanner scan = new Scanner (System.in);
//		System.out.println(" 메뉴를 고르세요 ");
//		System.out.println("1 : 커피, 2 : 차, 3 : 음료, 0 : 종류 ");
//		int menu = scan.nextInt();
//		if( menu == 1 ) {
//			System.out.println("커피를 드리겠습니다");
//		}else if ( menu == 2 ) {
//			System.out.println("홍차 그리겠습니다");
//		}else if ( menu == 3 ) {
//			System.out.println("음료 드리겠습니다");
//		}else if ( menu == 0 ) {
//			System.out.println("다음에 또 오세요");
//		}	
//		int menu = -1; //0이 아닌 값을 적어 놓고 while 실행되게 만듬
//		//몇번 반복할지 모를 때 적당하다
//		while(menu != 0) {
//			System.out.println(" 메뉴를 고르세요 ");
//			System.out.println("1 : 커피, 2 : 차, 3 : 음료, 0 : 종류 ");
//			 menu = scan.nextInt();
//			if(menu >= && menu <= 3) { 
//			if( menu == 1 ) {
//				System.out.println("커피를 드리겠습니다");
//			}else if ( menu == 2 ) {
//				System.out.println("홍차 그리겠습니다");
//			}else if ( menu == 3 ) {
//				System.out.println("음료 드리겠습니다");
//			}else if ( menu == 0 ) {
//				System.out.println("다음에 또 오세요");
//			}	
//		  } else if{
//		System.out.println("오늘 영업 종료입니다.");
//		  }
//		}
//	   
//		
//		int menu2;
//		do {
//			System.out.println(" 메뉴를 고르세요 ");
//	    	System.out.println("1 : 커피, 2 : 차, 3 : 음료, 0 : 종류 ");
//			menu2 = scan.nextInt();
//			
//			if(menu2 >= && menu2 <= 3) { 
//				if( menu2 == 1 ) {
//					System.out.println("커피를 드리겠습니다");
//				}else if ( menu2 == 2 ) {
//					System.out.println("홍차 그리겠습니다");
//				}else if ( menu2 == 3 ) {
//					System.out.println("음료 드리겠습니다");
//				}else if ( menu2 == 0 ) {
//					System.out.println("다음에 또 오세요");
//				}	
//			  } else if{
//			System.out.println("오늘 영업 종료입니다.");
//			  }
//		}
//		
		int i = 1;
		while( i <= 10 ) {
			System.out.println(i);
			i++; //종료 조건을 주는 것이 졸음 
		}
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("메뉴를 고르세요");
//		System.out.println("1:커피, 2:차, 3:음료, 0:종료");
//		int menu = scan.nextInt();
//		if( menu == 1 ) {
//			System.out.println("커피 드리겠습니다");
//		} else if(menu == 2) {
//			System.out.println("홍차 만들께요");
//		} else if(menu == 3) {
//			System.out.println("음료 드릴께요");
//		} else if(menu == 0) {
//			System.out.println("다음에 또 오세요");
//		} 
//		
//		if(menu != 0) {
//			System.out.println("메뉴를 고르세요");
//			System.out.println("1:커피, 2:차, 3:음료, 0:종료");
//			menu = scan.nextInt();
//			if( menu == 1 ) {
//				System.out.println("커피 드리겠습니다");
//			} else if(menu == 2) {
//				System.out.println("홍차 만들께요");
//			} else if(menu == 3) {
//				System.out.println("음료 드릴께요");
//			} else if(menu == 0) {
//				System.out.println("다음에 또 오세요");
//			} 
//			
//			if(menu != 0) {
//				System.out.println("메뉴를 고르세요");
//				System.out.println("1:커피, 2:차, 3:음료, 0:종료");
//				menu = scan.nextInt();
//				if( menu == 1 ) {
//					System.out.println("커피 드리겠습니다");
//				} else if(menu == 2) {
//					System.out.println("홍차 만들께요");
//				} else if(menu == 3) {
//					System.out.println("음료 드릴께요");
//				} else if(menu == 0) {
//					System.out.println("다음에 또 오세요");
//				} 
//				
//				
//			}
//		}
		
		/*
//		System.out.println("메뉴를 고르세요");
//		System.out.println("1:커피, 2:차, 3:음료, 0:종료");
//		int menu = scan.nextInt();
		int menu = -1; // 0이 아닌 값을 적어놓고 while 실행되게 만들었음
		// 몇번 반복할지 모를때 적당하다
		while(menu != 0) {
			System.out.println("메뉴를 고르세요");
			System.out.println("1:커피, 2:차, 3:음료, 0:종료");
			menu = scan.nextInt();
			if(menu >= 0 && menu <= 3) {
				
				if( menu == 1 ) {
					System.out.println("커피 드리겠습니다");
				} else if(menu == 2) {
					System.out.println("홍차 만들께요");
				} else if(menu == 3) {
					System.out.println("음료 드릴께요");
				} else if(menu == 0) {
					System.out.println("다음에 또 오세요");
				}
				
			} else {
				System.out.println("메뉴를 다시 선택해주세요");
			}
		}
		System.out.println("오늘 영업 종료");
		*/
		
		// while문 안에 내용을 그 위에 한번 더 쓰는 경우
		// do while이 적당하다
		int menu;
		do {
			System.out.println("메뉴를 고르세요");
			System.out.println("1:커피, 2:차, 3:음료, 0:종료");
			
			menu = scan.nextInt();
			
			if(menu >= 0 && menu <= 3) {
				
				if( menu == 1 ) {
					System.out.println("커피 드리겠습니다");
				} else if(menu == 2) {
					System.out.println("홍차 만들께요");
				} else if(menu == 3) {
					System.out.println("음료 드릴께요");
				} else if(menu == 0) {
					System.out.println("다음에 또 오세요");
				}
				
			} else {
				System.out.println("메뉴를 다시 선택해주세요");
			}
		} while(menu != 0);
		
		
	}
	
}
