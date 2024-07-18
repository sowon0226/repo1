package sec04_실습.exam_04;

import java.util.Scanner;

public class Up {

	/*
	 * up down 게임 - 나이 맞추기
	   임의의 수 0~9에서 하나 결정(랜덤)
	   정답 (3)
	   >>up (시도회수: 1)
	   정답(8)
	   >>down (시도회수: 2)
	 */
	Scanner scan = new Scanner(System.in);
	int count = 1;
	double rand = Math.random();
//	int a = (int) rand;
	int number = (int)(rand * 10);
	
	void a () {
		while (true) {
			int b = scan.nextInt();
			if(b > number) {
				System.out.println("다운" + "시도 회수 : "+ count);
				count++;
			}else if (b < number) {
				System.out.println("업" + "시도 회수 : "+ count);
				count++;
			}else if(b == number){
				System.out.println("정답");
				
				break;
			}
	}
	}


	void dowm() {
		System.out.println("시도 회수 : " +2);
	}
	

}
