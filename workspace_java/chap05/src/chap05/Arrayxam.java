package chap05;

import java.util.ArrayList;

public class Arrayxam {

	public static void main(String[] args) {
		
		// 기본 타입에는 null을 넣을 수 없음
		// null은 int도 아닌고 double 아니다
//		int a =ull;
		
		//   배  열 : 변수를 한번에 만들어 주는것
		// 한번에 여러 변수를 만드는 방법
		// 같은 타입만 선언할 수 있다
		// 생성 된 여러 변수들은 index로 관리할 수 있다
		
		// 선언 방법
		// "int로 구성된 배열이다"
		int [] score;  // java 스타일
		int score2[];  // c 스타일
		
		score = null;
		
		int[] score3 = null; // score은 배열이여서 null을 사용할 수 있다
		
		int score_0 = 90;
		int score_1 = 60;
		int score_2 = 70;
		
		//   각 타 입 별 배 열 선 언 예 1 : int[] intArray;, double[] dobleArray;, String[] strArray;
		//   각 타 입 별 배 열 선 언 예 2 : int intArray[];, double dobleArray[];, String strArray[];
		// 배열을 생성할때 크기를 알려줘야 합니다.
		// 첫번째 [] : int로 루어진 배열이다
		// 두번째 [3] : 배열의 크기; 한번에 만들 변수의 개수
		//					연달아서 타입의 크기만큼 메모리 할당
		//					첫번째 변수부터 index0으로 시작
		// 세번째 intArray[0] : 만들어진 변수들 중 첫번째 변수를 뜻함
		int[] intArray = new int[3]; //int[](배열) 괄호 안에 숫자를 넣으면 안됨 선언하는거여서
		intArray[0] = 90; // 첫번째 변수
		intArray[1] = 60;
//		intArray[2] = 70;
		
		System.out.println("intArray[1] :"+intArray[1] );
		
		// 기본값은 0 , false, null 로 초기화 된다
		System.out.println("intArray[2] :"+intArray[2] );
		
//		System.out.println("intArray[3] :"+intArray[3] );
		// java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3at chap05.Arrayxam.main(Arrayxam.java:45)
		//에러 코드
		
		// 배열의 모든 값을 1로 바꾼다
		intArray[0] = 1;
		intArray[1] = 1;
		int a = 1;
		a++;
		intArray[a] = 1;
		
//		for(int i= 0; i <= 3-1; i++) 3-1 로도 사용가능
		for(int i= 0; i <  3; i++) {// 예 i<3 대신에 intArray.length을 쓸수 있다
			intArray[i] = 1;
		}
		
		for(int i=0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println(intArray); //[I@59f95c5d 출력 결과물 (intArray 어딘가에 들어있는 주소 값), I는 int를 얘기함
		System.out.println(intArray.length);
		// 한번 선언 된 배열의 크기를 바꿀 수 없다
//		intArray.length = 4;  바꿀 수 없다
		
		
		// 배열을 선언하는 두번째 방법
		// 값을 미리 알고 있을 때
		// 크기는 알아서 계산된다
		int[] intArray2 = new int[] {10, 20, 30, 40}; //{} 값이 정해져 있을 때 사용 가능 
//		 intArray2 = new int[] {10, 20, 30, 40,50 }; 숫자 추가 가능함
		for(int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);
		}
		// 세번쨰 방법
		// 선언과 동시에 초기화 할 때만 가능 // new int[] 생략 가능함
		int[] intArray3 = new int[] {100, 200, 300, 400};
//		
		for(int i = 0; i < intArray3.length; i++) {
			System.out.println(intArray3[i]);
		}
		
		/* 결과는 (예)
		 * 최민수1
		 * 최민수 2
		 * ...
		 */
		String[] strArray = new String[5];
		for(int i = 0; i < strArray.length; i++) {
			strArray[i] = "김 소원"+ (i+1);
		}
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		// 1~10까지 배열에 넣고
		// 배열의 총 합 출력
		// 배열의 평균 값 출력
		int[] score5 = new int[10];
		for(int i = 0; i < score5.length; i++) {
			score5[i] = i+1; // 그냥 하면 0부터 들어가기 때문에 +1을 해줘야 1부터 시작
		}//		 [i]는 int를 뜻함  +1은 index를 말함
		int sum = 0;
		for(int i = 0; i < score5.length; i++) {
			sum += score5[i];
		}
		System.out.println("총 합 : "+ sum);
		
		double avg = (double) sum /  score5.length;
		System.out.println("평균 :  "+ avg );
		
		int student1 = 90;
		int student2 = 100;
		
		int[] class1 = new int[22];
		int[] class2 = new int[22];
		int[] class3 = new int[22];
		int[] class4 = new int[22];
		
		// 2차원 배열
		// 맨뒤의 []는 배열을 뜻하고 그 앞에 있는 모든건 배열의 내용을
		// int[]을 변수들로 관리하는 배열이 된다는 뜻
		// [4]는 "천안"의 크기 즉 "천안"으로 관리되는 변수의 개수
		int[][] 천안 = new int[4][22];
		
		System.out.println(천안); // [[I@9e89d68
		System.out.println(천안[0]); // [I@3b192d32 @안쪽으로 무언가 있다는 뜻
		System.out.println(천안[0][0]); // 0
		
		
		int[][] test = new int [3][2];
		int[][] tes2t = { 
							{5, 6},
							{12, 15},
							{93, 87}
		  };
		
		int[] 클래스1 = 천안[0];
//		int 학생1 = 클래스1[0];  또는  
		int 학생1 = 천안[0][0]; // 쓸 수 있다 (클래스1 = 천안[0]과 같은 말이여서)
		
		// 3차원 배열
		int[][] 수원 = new int[4][22];
		int[][] 서울 = new int[4][22];
		
		int[][][] 휴먼 = new int[3][4][22];
		System.out.println(22 * 4 * 3); // 22명씩 * 4반 * 3개의 시(천안, 수원, 서울)
		System.out.println(휴먼); // [[[I@16f65612
		
		System.out.println("휴먼.length : "+ 휴먼.length);
		System.out.println("휴먼[0].length : "+ 휴먼[0].length);
		System.out.println("휴먼[0].length : "+ 휴먼[0][0].length);
		
		int[][] 달력 = new int[12][31]; // 숫자 하나만 바꿔도 length를 사용하면 다른 숫자들을 바꿀 필요가 없다 예) 31을 310으로 바꾼다 했을 때
		for(int i = 0; i < 달력.length; i++) {
			
			for(int j = 0; j < 달력[i].length; j++) {
				
//				System.out.println(달력[i][j]);
				System.out.println("i : "+ i+",j : "+j+",달력[i][j] : "+ 달력[i][j]);
			}
		}
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("문자");
		list.add("true");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// 배열의 length 
		System.out.println(list.size()); //( .size로 사용해야함 . 앞에는 변수여서 바뀜 )
		System.out.println(list);
		
		
		// 랜덤 뽑기 만들기 
		// 세번쨰 방법
		System.out.println("------스터디-------");
		String[] study = {
				" 박규태", 
				" 이제섭",
				" 김아영", 
				" 박경민",
				" 정근승", 
				" 현준수",
				" 남현우", 
				" 김승환",
				" 조민정", 
				" 이정은"
				};
		System.out.println("종 "+ study.length + "명");
		
//		//배열에서 random으로 뽑기	
//		double rand = Math.random() * study.length;
//		// 0 ~ 9.9999
//		int index = (int) rand; //0 ~ 9
//		System.out.println("실험 : "+ study[index]);
		
		/*
		 * 랜덤으로 뽑는걸 100번해서 가장 많이 나온 사람을 선택
		 * (기록한다는 저장한다와 같은 말로 생각해야 쉽게 문제를 풀 수 있음)
		 */
		int[] vote = new int[study.length];
		for(int i = 0; i < 1000; i++);{
		//배열에서 random으로 뽑기	
		double rand = Math.random() * study.length;
		// 0 ~ 9.9999
		int index = (int) rand; //0 ~ 9
	
		
		vote[index] += 1;
		}
		for(int i=0;i<vote.length;i++) {
			  System.out.println("index :"+i+", 득표수: "+vote[i]);   
		}
		for(int i=0;i<study.length;i++) { 
			System.out.println("index :"+i+", 이름: "+study[i]);  
		}
		// vote[index] +=1;를  쓴 이유 :  
		
		
		
		//       로      또  
		// 6개의  lotto 번호를  저장하고 싶다
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length; i++) {
			
			lotto[i] = (int)(Math.random() * 45) + 1;
			// 문제는 중복이 나와서 
			
		}
		
		for(int i = 0; i < lotto.length; i++ ) {
			System.out.println(i + " 번호 : "+ lotto[i]);
		}
		
		
	}
	
}
