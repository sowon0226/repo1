package sec04.exam04;

public class CalcExam {

	public static void main(String[] args) {
		Calc Calc = new Calc();
		Calc.execute(); 
		// execute() 안에 println이 들어가 있어서
		// 굳이 출려을 안 뽑아도 됨
//		Calc Calc2 = new Calc();
//		Calc2.println();
		// 오류가 나는 이유는 
		// 전달인자가 없어서 실행이 안된거였음
		Calc.println("ㄱㄴㄷ");
		// 살행이 된 이유가 궁금
		// println(String message)여서 숫자가 아닌 글자를 출력해야함
	}

}
