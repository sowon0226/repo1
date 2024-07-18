package sec04_실습.exam_04;

public class Song {
	String title;
	String artist;
	String genre;
	String lyrics;
	String rhr;
	int  duration;
	/* 
	 * 문제 3
	 * 멜론 노래 관리 DB
	 * class song
	 * 필드 : 제목, 가수명, 장르, 가사, 곡 길이
	 * 메소드 : 
	 * -각각의 값을 지정하는 것(제목바꾸기 같이)
	 * - 모든 정보 표시
	 * class SongExam
	 * 3곡 이상의 노래를 등록해서 관리
	 */ 
	
	void ti(String t, String a, String g,
			String l, String r) {
		this.title = t;
		this.artist = a;
		this.genre = g;
		this.lyrics = l;
		this.rhr = r;
	
		
	}
	void ti(String t) {
		title = t;
		System.out.println("제목 : "+ "제목");
	}
	void t(String a) {
		artist = a;
	}
	void i(String g) {
		genre = g;
	}	
	void h(String l) {
		lyrics = l;
	}
	void k(String r) {
		rhr = r;
	}
	void println(){
		System.out.println("============");
		System.out.println("제목 : "+ title);
		System.out.println("가수명 : "+ artist);
		System.out.println("장르 : "+ genre);
		System.out.println("가사 : "+ lyrics);
		System.out.println("곡 길이 : "+ rhr);
	}
//	private String title;
//	private String singer;
//	private String genre;
//	private String lyric;
//	private int duration;
//	
//	// title getter
//	// get+필드명(대문자로 시작)
//	// 전달인자 : 없음
//	// 리턴타입 : 필드의 타입
//	public String getTitle() {
//		return this.title;
//	}
//	
//	// title setter
//	// set+필드명(대문자로 시작)
//	// 전달인자 : 필드의 타입
//	// 리턴타입 : 없음
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getSinger() {
//		return singer;
//	}
//
//	public void setSinger(String singer) {
//		this.singer = singer;
//	}
//
//	public String getGenre() {
//		return genre;
//	}
//
//	public void setGenre(String genre) {
//		this.genre = genre;
//	}
//
//	public String getLyric() {
//		return lyric;
//	}
//
//	public void setLyric(String lyric) {
//		this.lyric = lyric;
//	}
//
//	public int getDuration() {
//		return duration;
//	}
//
//	public void setDuration(int duration) {
//		this.duration = duration;
//	}
//
//	@Override
//	public String toString() {
//		return "Song [title=" + title 
//				+ ", singer=" + singer 
//				+ ", genre=" + genre 
//				+ ", lyric=" + lyric 
//				+ ", duration=" + duration + "]";
//	}
	
}
