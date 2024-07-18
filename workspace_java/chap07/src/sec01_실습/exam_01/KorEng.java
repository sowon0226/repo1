package sec01_실습.exam_01;

import java.util.ArrayList;

public class KorEng extends Dict {

	ArrayList en_words = new ArrayList();
	
	KorEng(){
		en_words.add("love");
		en_words.add("friendship");
		
		this.words = en_words;
	}
}	