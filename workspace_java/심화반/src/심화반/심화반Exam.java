package 심화반;

public class 심화반Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 연산자 (+, -, *, ==)
		// 형변환 연산자 ex) (int)
		// 피연산자 : 연산을 당하는 것 (변수 x, y, z...등등)
		//

		int a1 = -1; //(단항연산자 +는 생략하면서 씀)
		// a2++; 또한 단항 연산자
		
		// int a3 = "asds"*3;
		int a2 = -1;
		   a2 = a2 +2; // 이항 연산자
		// 대입 : =을 기준으로 오른쪽을 먼저 봄 +=,-=등등
		   
	    a2 = 10;
	    int a3 = a2++; // +가 뒤에 나오면  a2를 먼저 사용후 ++ 더함
	   // int a4 = ++a2; // +가 앞에 있으면 +를 먼저 계산 수 a2를 더함
	    System.out.println("a3 : "+ a3);
	    System.out.println("a2 : "+ a2);
		
	    System.out.println("----------------------");
	  //  a2 = 10;
	 //   a3 = 1 + (++a2); //   a2 + 1 을 해서 12 
	    // a2가 10이니까 ++a2는 1이 먼저 증가해서 1 +11 해서 12
	    // a3 = (a2++) + 2; // 10 + 2을 해서 12
	    // a3 = (a2++) + (a2); // a2++ 에서 +를 넘어갈 때 11이됨 여기서 a2++는 아직 10임 
	    // a3 = 2 + ++a2 + 1; 
	    // a3 = 2 + a2++ + 1;
	  //  System.out.println("a3 :" + a3);
		
		a2 =3;
		a3 = a2++ + a2++;
		System.out.println("a2 : "+a2); // 결과 값이 5인 이유는 a2++ = 3 에서 + 로 넘어가면서 4로 변하고 4가 ;로 넘어가면서 5가됨
		System.out.println("----------------------");
		
		a2= 2;
		a3 = a2++ + ++a2 - --a2 - a2-- + --a2;
		// a3 = 2 + 4 - 3 - 3 + 1
		System.out.println("a3 : "+ a3);
		System.out.println("a2 : "+ a2);  
		
		
	}

}
