package sce01.exam08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeExam {

	public static void main(String[] args) {
		
		// timestamp
		// unix timee
		long now = System.currentTimeMillis();
		System.out.println(now);
		
		for(int i = 0; i < 10000; i++){
			System.out.println(i);
		}
		
		System.out.println( System.currentTimeMillis() - now);
		
		
		Date date = new Date();
		System.out.println(date);
		
		String fromat = "yyyy년 MM월 dd일 HH:mm:ss.SSS";
		SimpleDateFormat  sdf= new SimpleDateFormat(fromat);
		String strDate = sdf.format(date);
		System.out.println(strDate);
		
		
		
	}

}
