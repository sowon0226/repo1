package sec01.exam01;

public class StudentExam {

	public static void main(String[] args) {
		
		// Student.java에 있는 것을 호출하는 연습
		
		Student s1 = new Student(); // 예) 도면을 만들고 = 3D로 출력하는 것

        Student s2 = new Student();

        Student s3 = null; // 변수만 만들고 힙 영역에 연결은 없음

        s3 = s1;
        System.out.println(s3 == s1); // 여기서 == 주소값
        System.out.println(s1 == s2);

        s2 = null;
        s3 = null;
        System.out.println(s2 == s3); // null과 null은 비교를 하면 true가 나옴

	}

}
