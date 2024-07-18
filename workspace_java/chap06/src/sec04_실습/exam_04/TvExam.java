package sec04_실습.exam_04;

public class TvExam {
	
	public static void main(String[] args) {
		Tv Tv = new Tv();
		Tv.TvOn();
		Tv.TvOff();
		Tv.vol("up");
		Tv.vol("down");
		Tv.ch("up",10);
		Tv.ch("down",0);
		Tv.j();
	}
}
		
