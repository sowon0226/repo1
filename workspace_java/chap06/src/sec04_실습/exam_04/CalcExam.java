package sec04_실습.exam_04;

public class CalcExam {

	public static void main(String[] args) {
		
		Calc Calc = new Calc();
		Calc.plus(3,5);
		double a= Calc.m(8, 4);
		System.out.println(a);
		double b =Calc.v(9, 2);
		System.out.println(b);
		double d =Calc.n(9, 2);
		System.out.println(d);
		double s =Calc.c(9, 2);
		System.out.println(s);
		Calc.add(3, "+", 5);
		Calc.add(3, "-", 5);
		Calc.add(3, "*", 5);
		Calc.add(3, "/", 5);
		Calc.add(3, "%", 5);

		
//		Calc calc = new Calc();
//		double result = calc.compute(1, "+", 2);
//		System.out.println(result);
//		
//		result = calc.compute(1, null, 2);
//		System.out.println(result);
	}

}
