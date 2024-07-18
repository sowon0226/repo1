package 심화반;

public class for문이해하기Exam {

	public static void main(String[] args) {
		
		for(int a = 1; a <= 10; a++) {
			System.out.println(a);
		}
		System.out.println("-------------------------------------------");
		// 123
		// 456 
		// 789
		// 1번줄에는 123하고 한줄 내려서
		// 2번줄에는 456이되고
		// 3번줄에는 789되고
//		for(int b = 1; b <= 3; b++) {
//			System.out.print(b);
//		
//		}System.out.println();
//		for(int c = 4; c <= 6; c++) {
//			System.out.print(c);
//		}System.out.println();
//		for(int d = 7; d <=9; d++) {
//			System.out.print(d);
//		}
	
//		for(int b = 1; b <=9; b++) {
//			System.out.print(b);
//		}System.out.println("-------------------------------------------");
//		for(int c = 1; c < 10; c++) {
//			System.out.print(c);
//			if(c == 3) {			
//				System.out.println();
//			}else if(c == 6) {
//				System.out.println();
//			}
//		}
		for(int b = 1; b < 10; b++) {
			System.out.print(b);
			if(b % 3==0) {
				System.out.println();
			}
		}
		System.out.println("-------------------------------------------");
		for(int c = 1; c <= 20; c++) {
			c++;
			System.out.println(c);
		}
		System.out.println("-------------------------------------------");
		int sum = 0;
		for(int d =2 ; d <=20; d= d+2) {
//			System.out.println(d);
			sum += d;
		}
		System.out.println(sum);
		System.out.println("-------------------------------------------");
		int e = 0;
		for(int d = 2 ; d <= 20; d = d+2) {
			e += 1;
		}	
		System.out.println(e);
	}

}
