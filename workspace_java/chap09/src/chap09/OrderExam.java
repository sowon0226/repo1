package chap09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderExam {

	public static void main(String[] args) {
		
		
		MemberDTO m1 = new MemberDTO();
		MemberDTO m2 = new MemberDTO();
		MemberDTO m3 = new MemberDTO();
		
		m1.setName("박규태");
		m1.setAge(40);
		
		m2.setName("김아영");
		m2.setAge(28);
		
		if(m1.equals(m2)){
			System.out.println("같습니다");
		}
		
		m3.setName("이정은");
		m3.setAge(26);
		
		System.out.println(m1.getAge() > m2.getAge());
		
		MemberDTO m4 = compareMemberDTO(m1, m2);
		System.out.println(m4);
		
		// 배열로 만들어 줄 떄 사용함 
		List list = new ArrayList();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		System.out.println(list);
		
//		Comparator comp = new OrderBy();
		
		// 익명객체 
		// 상속받은 클래스는 없지만 
		// new 해줌
		// 위의 new OrderBy()와 아래의 코드는 완전히 같은 코드 이다.
		// 아래 방법은 익명 객체라고 한다
		// 이름이 없는 클래스를 nwe하고
		// 뭔가 클래스명을 적어야 할것 같은 곳에
		// interface를 적용
		// 단, 하나의 인터페이스만 사용할 수 있음
		// 이러면 그  interface를 구현할 수 있다
		Comparator comp = new OrderBy(){

			@Override
			public int compare(Object o1, Object o2) {
				MemberDTO dto1 = (MemberDTO) o1;
				MemberDTO dto2 = (MemberDTO) o2;
				
				
				return dto1.getAge() - dto2.getAge();
			}
			
		};
		Collections.sort(list, comp);
		System.out.println(list);
	}
	
	/**
	 * 기능 : 둘 중에 나이가 큰 MemberDTO를 돌려줌
	 * 
	 * 
	 * @param MemberDTO, MemberDTO
	 * @return MemberDTO
	 */
	// MemberDTO 안에 나이를 갖고있음
	// 나이를 비교해서 돌려줌
	static MemberDTO compareMemberDTO(MemberDTO dto1, MemberDTO dto2) {
		if(dto1.getAge() > dto2.getAge()) {
			return dto1;
		}else {
			return dto2;
		}
		
//		if(dto1.getAge() - dto2.getAge() > 0) {
//			return dto1;
//		}else {
//			return dto2;
//		}
		
		
	}
}
