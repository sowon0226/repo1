package sec04_실습.exam_04;

public class SongExam {

	public static void main(String[] args) {
		Song Song = new Song();
		Song Song1 = new Song();
		Song Song2 = new Song();
		Song.ti("제목","가수명","장르","가사","곡 길이");
		Song1.ti("제목1","가수명","장르","가사","곡 길이");
		Song2.ti("제목2","가수명","장르","가사","곡 길이");
		Song.println();
		Song2.println();
		Song2.println();
		Song2.ti("제목3");
		Song2.println();
		
//	ArrayList list = new ArrayList();
//		
//		Song s1 = new Song();
//		s1.setTitle("수퍼노바");
//		s1.setSinger("에스파");
//		s1.setGenre("k-pop");
//		s1.setLyric("I’m like some kind of Supernova");
//		s1.setDuration(193);
//		System.out.println(s1.toString());
//		list.add(s1);
//		
//		Song s2 = new Song();
//		s2.setTitle("愛が灯る");
//		s2.setSinger("ロクデナシ");
//		s2.setGenre("j-pop");
//		s2.setLyric("ただいつもより寂しくなって");
//		s2.setDuration(200);
//		System.out.println(s2.toString());
//		list.add(s2);
//		
//		Song s3 = new Song();
//		s3.setTitle("천상연");
//		s3.setSinger("이창섭");
//		s3.setGenre("발라드");
//		s3.setLyric("아니길 바랬었어, 꿈이길 기도했지");
//		s3.setDuration(275);
//		System.out.println(s3.toString());
//		list.add(s3);
//		
//		Song s4 = (Song)list.get(0);
//	}
	}
}
