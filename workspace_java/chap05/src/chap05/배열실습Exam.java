package chap05;

import java.util.Scanner;

public class 배열실습Exam {

	public static void main(String[] args) {
		/*
		 * 배열의 예 {1, 5, 2, 4,}
		 * 1. 배열 뒤집기 :  {4, 2, 5, 1}
		 * 2. 첫번째 자리에 0 넣기 {0, 1, 5, 2, 4}
		 * 3. 마지막 숫자를 첫번째에 넣기(회전하는 느낌) {4, 1, 5, 2}
		 * 
		 * 배열의 예 {3, 4, 7, 5, 1, 4, 6, 4, 5}
		 * 4. 홀/짝수의 각각 개수를 출력
		 * 5. 주어진 수(예를 들어 4)보다 큰 숫자의 개수
		 * - 여기서부터 조금 어려운 문제
		 * 6. 두번째 최대값
		 * 7. 내림차순으로 정렬 (큰 수부터 작은 수 순으로)
		 * 
		 *  로또 6개 번호(1 ~ 45)
		 *  8. 중복되지 않게 숫자 선정
		 *  9. 자리 예약
		 *  자리가 10개 있는 소극장 예약 시스템을 만들자
		 *  1 ~ 10(또는 0 ~ 9)번까지 번호의 자리가 있음
		 *  예약할 자리는 ? 하고 입력 받음
		 *  1-1) 예약이 가능하면 "예약했습니다"
		 *  1-2) 예약 불가능하면 "이미 예약 되었습니다"
		 *  2) 모든 자리의 예약 가능 여부 출력
		 *  3) 예약 가능한 자리만 출력
		 *  
		 *  10. 임시비밀번호 8자리 만들기
		 *  1) 모두 다 숫자로
		 *  2) 모두 다 소문자로 (hint : char ascii)
		 *  3) 숫자 2개 이상, 대문자 1개 이상, 소문자 1개 이상 조합
		 */
		//     배열 뒤집기
		int[] a = {1, 5, 2, 4,};
		int[] a1 = new int[a.length]; // 깊은 복사 
		for(int i = 0, j = 3; i < a1.length; i++,j--) { // i는 인덱스가(0에서부터) 하나씩 더해지는것이고, j는 반대로 뒤에서부터 인덱스가 하나씩 빠짐.
			a1[i] = a[j];
			/*
			 * a1[0,1,2,3] = a[3,2,1,0] 인덱스(배열에 붙은 번호)가 0으로 시작함
			 * 
			 * a1[0] = a[3] -> a1[0] = 4
			 * a1[0] = a[3] -> a1[0] = 2
			 */
		}
			for(int i = 0; i < a1.length; i++) {
				System.out.println(a1[i]);
		}
			// 2. 첫번째 자리에 0 넣기 {0, 1, 5, 2, 4}
			int[] a2 = new int[4];
			a2[0] = 1;
			a2[1] = 5;
			a2[2] = 2;
			a2[3] = 4;
			int[] a3 = new int[a2.length];
			a3 = new int[a2.length + 1];
			for(int i = 0; i < a2.length; i++) { 
				a3[i+1] = a2[i];
			}
			a3[0] = 0;
			System.out.println();
			for(int i = 0; i < a3.length; i++) {
				System.out.print(a3[i]);
			}
			// 3. 마지막 숫자를 첫번째에 넣기(회전하는 느낌) {4, 1, 5, 2}
			
	    //     배열의 예 {3, 4, 7, 5, 1, 4, 6, 4, 5}		
			// 4. 홀/짝수의 각각 개수를 출력
			// 5. 주어진 수(예를 들어 4)보다 큰 숫자의 개수
			int[] array = {3, 4, 7, 5, 1, 4, 6, 4, 5};
			Scanner scan = new Scanner (System.in); // 이해 못함
			int b = scan.nextInt();
			int count = 0;
			for(int c = 0; c <array.length; c++) {
				if(b < array[c]) {
					count++;
				}
				System.out.println(array.length);
			}
			
//			int m = 25000;
//			int c = 6;
//		    double h3 = ((double) m / c);
//			System.out.println(h3);
			
	}

}
