package sec01_실습.exam_01;

public class DictKorEng {

	/*
	 * 전달인자로 받은 단어에 대응하는 단어를 돌려주는 메소드 만들기
	   한영/한일 사전을 만들때 공통되는 사전이라는 부모 클래스 활용해보기
	   
	   한영사전
	   translate("사랑") == "Love"
	   ("우정") == "Friendship"
	   ("꿻") == "잘모르겠습니다"
	   
	   String target1 = "Love"
	   String ko1 == "사랑"
	   if(word.equals(ko1)){
	      return en1;
	   한일사전
	   ("사랑") == "아이시떼루"
	   ("우정") == "유조우"
	   ("꿻") == "잘모르겠습니다"
	    String target1 = "아이시떼루"
	   String ko1 == "사랑"
	   if(word.equals(ko1)){
	      return en1;
	      
	   사전 
	   String target1 = null;
	   String ko1 = "사랑"
	   translate(String word)
	 */
	
	String ko_word1 = "사랑";
	String en_word1 = "love";
	
	String ko_word2 = "우정";
	String en_word2 = "friendship";
	
	// String으로 이루어진 배열 : String[]
	// 그 배열의 변수명 : ko_word
	// String 으로 이루어진 2개짜리 배열을 생성해라 : new String[2]
	// String 변수 2개를 자동으로 생성했다
	String[] ko_word =new String[2];
	String[] en_word =new String[2];
	
	DictKorEng() {
		
	// 그 2개의 변수 중 첫번째 변수는 : ko_word[0]
		ko_word[0] = "사랑";
		ko_word[1] = "우정";
		
		en_word[0] = "love";
		en_word[1] = "friendship";
	}
	
	
	// 메소드명 : translate
	// 전달인자 : String한글단어
	// 리턴타입 : String영어단어
//	String translate(String word) {
//		if(ko_word1.equals(word)) {
//			return en_word1;
//		}else if(ko_word2.equals(word)) {
//			return en_word2;
//		}else {
//			return "그런 단어는 모릅니다";
//		}
//	}
	
	// 메소드명 : translate
	// 전달인자 : String한글단어
	// 리턴타입 : String영어단어
	String translate(String word) {
		for(int i = 0; i < ko_word.length; i++) {
			if(ko_word[i].equals(word)) {
				return en_word[i];
			}
		}
			return "그런 단어는 모릅니다";
	}
}
