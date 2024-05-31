package chap05;

public class ArrayCopyExam {

	public static void main(String[] args) {
		//    배   열   복   사
		// 커피 1호점에서 판매하는 메뉴
		String[] coffee = new String[3];
//		coffee[0] = " 아 아 ";
		coffee[0] = " 따 아 ";
		coffee[1] = " 라 떼 ";
		coffee[2] = " 말 차 ";
		
		// 커피 2호점에서 1호점과 똑같은 커피를 판매할껍니다
		/*
		 * 얕은 복사 shallow copy, thin clone, call by copy 라고도 부름
		 * stack영역의 값(주소)만 복사
		 * 원본이 바뀌면 당연히도 내 값도 바뀐다
		 */
		String[] coffee2 = coffee; // 주소값만 복사 (얕은 복사)
		for(int i = 0; i < coffee2.length; i++) {
			System.out.println(coffee2[i]);
		}
		
		// 얕은 복사로 연결되어 있기때문에 
		// 내껄 바꿔도 원본이 바뀐다
		// 원본이 "주소만를 공유"하고 있기 때문에 coffee나 coffee2는 같다
		coffee2[1] = " 연유라떼 ";
		System.out.println("coffee2[1]의 값을 바꾸고 원본인 coffee를 출력");
		for(int i = 0; i < coffee.length; i++) {
			System.out.println(coffee[i]);
		}
		
		// 할 일 : 크기와 내용을 동일하게 가지는 새로운 배열을 만들겠다
		
		/*
		 * 깊은 복사 , deep copy, deep clone, call by value라고도 부름
		 * heap영역의 새로운 주소에 자리를 마련하고 변수에 주소를 넣는다
		 * 그리고 원본의 값들을 복사래서 채워넣는다
		 * 그래서 원본과 동일하게 생기지만 전혀 다른 주소를 가지게 된다
		 * 즉, 내 갓을 바꿔도 원본이 바뀌지 않음
		 */
		String[] coffee3 = new String[coffee.length]; // 원본과 똑같이 만들고 차례대로 복사 붙이기
//		coffee3[0]  = " 따 아" // 수동이나까 원본이 바뀌면 이것도 바꿔줘야 하니까
//		coffee3[0]  = coffee[0];
		for(int i = 0; i < coffee3.length; i++) { 
			coffee3[i] = coffee[i];
		}
		System.out.println("coffee3 출력");
		coffee3[2] = " 아 샷 추";
		for(int i = 0; i < coffee3.length; i++) {
		System.out.println(coffee3[i]);
		}
		System.out.println("coffee3[2]의 값을 바꾸고 원본인 coffee를 출력");
		for(int i = 0; i < coffee.length; i++) {
			System.out.println(coffee[i]);
		}
		
		
		// coffee3에 "사라다빵"을 추가하려면 ?
//		coffee3 = new String[] {" 따 아 ", "연 유 라 떼", " 아 샷 추", " 사 라 다 빵"};
		// coffee의 크기에서 하나 크게 만들고 나서 추가
		/*
		 * 전 략 : coffee의 크기보다 1개 많은 새로운 배열을 만들고
		 * 앞에서부터 복사해 놓고
		 * 마지막에 추가할 값을 적어보자
		 */
		coffee3 = new String[coffee.length + 1];
		// 앞에 3개만 복사
		for(int i = 0; i < coffee.length; i++) { 
			coffee3[i] = coffee[i];
		}
		// 비어있는 index에 추가
		coffee3[3] = " 사라다빵 ";
		System.out.println("4번째 메뉴를 추가한 결과");
		for(int i = 0; i < coffee3.length; i++) {
//			System.out.println(coffee3[i]);
//			System.out.println(coffee3[i]);
			String menu = coffee3[i];
			System.out.println(menu);
		}                                                                                                          
		
		//    향 상 된  for문
		System.out.println("향상된 for문");
//		int cnt = 0; 
		for( String menu : coffee3 ) {
//			cnt++;
			System.out.println(menu);
		}
		
		/* int는 4byte여서 0부터 시작
		 *  예 ) a = 10000 + 4byte * 0 ---->10000
		 *     a[1] = 10000 + 4byte * 1 ---->10004
		 */    
		
		
//		int[] a2 = {1,2,3};
		int[][] a2 = new int[10][100];
		// 자식별로 크기를 다르게 선언 할 수 있다
		int[][] a3 = {
						{1,2},
						{1,2,3}
		             };
	}
}
