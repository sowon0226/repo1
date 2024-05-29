package sac01.exam01;

public class 연습Exam {

	public static void main(String[] args) {
		
		for (int i3 = 1; i3 <= 10; i3 = i3 + 1) {
			System.out.println(i3);
		}
		for (int i3 = 1; i3 <= 10; i3 = i3 + 1) {
			System.out.print(i3 + ",");
		}
		for (int i3 = 1; i3 <= 10; i3 = i3 + 1) {
			System.out.print(i3 + " ");
		}
		for(int a = 1; a <= 3; a++ ) {
			for(int a1 = 1; a1 <=5; a1++ ) {
			System.out.print("+");	
			}
			System.out.println();
			 System.out.println("4단계");
			 for(int b = 1; b <= 1; b++) {
					System.out.print("+");
			 }
			 for(int b = 1; b <= 4; b++) {			
					System.out.print(".");
				}		
				 	System.out.println();
		}
		for (int k = 1; k <= 9; k++) {
			System.out.println("2 * " + k + " =" + (2 * k));
			
		}
		for (int k = 2; k <= 2; k++) {
			System.out.println( k + "단");
		}
	}

}
