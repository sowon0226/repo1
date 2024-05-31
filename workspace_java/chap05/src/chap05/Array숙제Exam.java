package chap05;

import java.lang.reflect.Array;

public class Array숙제Exam {

	public static void main(String[] args) {
		// p.223 5문제
		// 2차원 배열이 주어졌을 때
		/*
		 * 1. 모두 출력
		 * 2. 합계 출력
		 * 3. 평균 출력 (합계를 개수로 나누기)
		 */
		// 1. 모두 출력
//		int[][] array = {
//				{95, 86},
//				{83, 92, 96,},
//				{78, 83, 93, 87, 88}
//		};
//		for(int a = 0; a < array.length; a++) {
//			for(int b = 0; b < array[a].length; b++) {
//				for(int c = 0; c < array[b].length; c++) {
//					System.out.println("array.length["+a+"]["+b+"]="+array[a][b+c]);
//				}
//			}
//		}
//		int[][] array = {
//							{95, 86},
//							{83, 92, 96,},
//							{78, 83, 93, 87, 88}
//					     };
//		// 1. 모두 출력                 0   01
//		int[] array1 = array[0]; // {95,86}
//		array1[0]
//		System.out.println(array[0][0]);
//		System.out.println(array[0][1]);  
//										// {83, 92, 96}
//		System.out.println(array[1][0]);
//		System.out.println(array[1][1]);
//		System.out.println(array[1][2]);
		
		// array[0].length만큼 반복
//		for(int i = 0; i < array[0].length; i++) {
//			System.out.println();
//		}
//		
//		// 2. 합계 출력
//		int sum = 0;
//		for(int j = 0; j < array.length; j++) {
//			
//			for(int i = 0;  i < array[j].length; i++) {
//				System.out.println(array[j][i]);
//				sum = sum + array[j][i];
//				count++;
//			}
//		}
//		System.out.println(" 종합 : "+ sum);
//		// 3-0 모든 개수 세기
//		// 모든 요소를 하나씩 세기
//		System.out.println(" 개수 : "+ count);
//		// 배열의 크기만 누적
//		count = 0;
	
		
		// 연습문제 5. 223p.
		// 2차원 배열이 주어졌을 때
		/*
		 * 1. 모두 출력
		 * 2. 합계 출력
		 * 3. 평균 출력 (합계를 개수로 나누기)
		 */
		int[][] array = {
							{95, 86},		// 2
							{83,92,96},		// 3
							{78,83,93,87,88}// 5
						};
//		1. 모두 출력
//		int[] array1 = array[0]; // {95, 86}
////		array1[0]
//		System.out.println(array[0][0]);
//		System.out.println(array[0][1]);
//		
//		System.out.println(array[1][0]);
//		System.out.println(array[1][1]);
//		System.out.println(array[1][2]);
//		
////		array[0].length만큼
//		for(int i=0; i<array[0].length; i++) {
//			System.out.println(array[0][i]);
//		}
//		
//		for(int i=0; i<array[1].length; i++) {
//			System.out.println(array[1][i]);
//		}
		
		for(int j=0; j<array.length; j++) {
			
			for(int i=0; i<array[j].length; i++) {
				System.out.println(array[j][i]);
			}
			
		}
		
//		2. 합계 출력
		int sum = 0;
		int count = 0;
		for(int j=0; j<array.length; j++) {
			
			for(int i=0; i<array[j].length; i++) {
//				System.out.println(array[j][i]);
				sum = sum + array[j][i];
				count++;
			}
			
		}
		System.out.println("총합 : "+ sum);
		
		// 3-0 모든 개수 세기
		// 모든 요소를 하나씩 세기
		System.out.println("개수 : "+ count);
		// 배열의 크기만 누적
		count = 0;
		for(int i=0; i<array.length; i++) {
			count += array[i].length;
		}
		System.out.println("개수2 : "+ count);
		
//		3. 평균 출력(합계를 개수로 나누기)
		System.out.println((double)sum / count);


			// p.222 문제 4
		// 주어진 배열에서 최대값 찾기
		// 전 략 : 배열의 첫번째 값부터 혹은 절대 나올 수 없는 최저치를 기준으로
		// 기준과 비교해서
		// 큰 값을 새로운 기준으로 정한다
		//그렇게 살아 남은 값이 최대값
//		int max = 0;
		int [] array2 = { 1, 5, 3, 8, 2, 9, 3 };
		int max = Integer.MIN_VALUE; // int가 가질 수 없는 최소, 최대 값
		for(int i = 0; i < array2.length; i++) {
			if( array2[i] > max) {
				max = array2[i];
			}
		}
		System.out.println("최대값 :"+ max);
	}
	

}
